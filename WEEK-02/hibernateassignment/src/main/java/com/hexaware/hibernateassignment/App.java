package com.hexaware.hibernateassignment;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.HibernateUtil;
import com.hexaware.hibernateassignment.entity.Policy;

public class App {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println(sessionFactory);

		Session session = sessionFactory.openSession();
		System.out.println(session);

		boolean flag = true;

		while (flag) {
			System.out.println("**WELCOME  to Policy Management System**");
			System.out.println("1.INSERT");
			System.out.println("2.UPDATE");
			System.out.println("3.DELETE");
			System.out.println("4.SELECT BY ID");
			System.out.println("5.SELECT ALL");
			System.out.println("6.EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Policy policy = readData(session);

				Transaction txn = session.beginTransaction();
				Serializable ser = session.save(policy);
				txn.commit();

				System.out.println("Record inserted successfully with ID: " + ser);
				break;

			case 2:
				Policy updatedPolicy = readData(session);
				Transaction updateTxn = session.beginTransaction();
				session.saveOrUpdate(updatedPolicy);
				updateTxn.commit();
				System.out.println("Record Updated Successfully.");
				break;

			case 3:
				System.out.println("Enter Policy ID to delete:");
				int deletePolicyId = scanner.nextInt();

				Transaction deleteTxn = session.beginTransaction();
				Policy policyToDelete = session.get(Policy.class, deletePolicyId);
				if (policyToDelete != null) {
					session.delete(policyToDelete);
					deleteTxn.commit();
					System.out.println("Policy Deleted Successfully.");
				} else {
					System.err.println("Policy not found.");
				}
				break;

			case 4:
				System.out.println("Enter Policy ID to retrieve:");
				int retrievePolicyId = scanner.nextInt();

				Policy retrievedPolicy = session.get(Policy.class, retrievePolicyId);
				if (retrievedPolicy != null) {
					System.out.println(retrievedPolicy);
				} else {
					System.err.println("Policy not found.");
				}
				break;

			case 5:
				List<Policy> policyList = session.createQuery("from Policy", Policy.class).list();
				for (Policy p : policyList) {
					System.out.println(p);
				}
				break;

			case 6:
				flag = false;
				System.out.println("Exiting Product Management System.");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}

		}
		session.close();
		sessionFactory.close();
	}

	private static Policy readData(Session session) {
		System.out.println("Enter Policy ID:");
		int policyId = scanner.nextInt();

		// Fetch the existing policy by policy_id
		Policy policy = session.get(Policy.class, policyId);

		if (policy == null) {
			// Policy does not exist, create a new one
			policy = new Policy();
			policy.setPolicyID(policyId);
		}

		System.out.println("Enter Policy Name:");
		policy.setPolicyName(scanner.next());

		System.out.println("Enter Company:");
		policy.setCompany(scanner.next());

		System.out.println("Enter Policy Type:");
		policy.setPolicyType(scanner.next());

		return policy;
	}

}
