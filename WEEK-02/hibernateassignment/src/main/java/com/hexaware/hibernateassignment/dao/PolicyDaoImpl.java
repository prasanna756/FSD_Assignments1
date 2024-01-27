package com.hexaware.hibernateassignment.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hexaware.hibernateassignment.entity.Policy;

@Repository
public class PolicyDaoImpl implements PolicyDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void createPolicy(Policy policy) {
		Session session = sessionFactory.getCurrentSession();
		session.save(policy);

	}

	@Override
	public void updatePolicy(Policy policy) {
		Session session = sessionFactory.getCurrentSession();
		session.update(policy);

	}

	@Override
	public void deletePolicy(int policyID) {
		Session session = sessionFactory.getCurrentSession();
		Policy policy = session.get(Policy.class, policyID);
		if (policy != null) {
			session.delete(policy);
		}

	}

	@Override
	public Policy getPolicyById(int policyID) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Policy.class, policyID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Policy> getAllPolicies() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Policy").list();
	}

}
