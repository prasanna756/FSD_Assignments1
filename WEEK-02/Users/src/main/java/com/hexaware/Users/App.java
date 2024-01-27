package com.hexaware.Users;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.Users.config.AppConfig;
import com.hexaware.Users.entity.Users;
import com.hexaware.Users.service.UserService;
import com.hexaware.Users.service.UserServiceImp;

public class App {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBean(UserServiceImp.class);

		UserService UserServiceImp = context.getBean(UserService.class);

		boolean flag = true;

		while (flag) {
			System.out.println("**WELCOME Users Management System**");
			System.out.println("1.INSERT");
			System.out.println("2.UPDATE");
			System.out.println("3.DELETE");
			System.out.println("4.SELECT BY ID");
			System.out.println("5.SELECT ALL");
			System.out.println("6.EXIT");

			try {
				int choice = scanner.nextInt();

				switch (choice) {
				case 1:
					Users user = readUserData();

					boolean isInserted = UserServiceImp.createUser(user);

					if (isInserted) {
						System.out.println("User inserted successfully.");
					} else {
						System.err.println("Insert failed.");
					}

					break;

				case 2:
					Users updatedUser = readUserData();
					boolean isUpdated = UserServiceImp.updateUser(updatedUser);
					if (isUpdated) {
						System.out.println("User Updated Successfully.");
					} else {
						System.err.println("Update failed.");
					}
					break;

				case 3:
					System.out.println("Enter User ID");
					int userId = scanner.nextInt();
					boolean isDeleted = UserServiceImp.deleteUserById(userId);
					if (isDeleted) {
						System.out.println("User Deleted");
					} else {
						System.err.println("User not found");
					}
					break;

				case 4:
					System.out.println("Enter User ID");
					int userId1 = scanner.nextInt();
					Users userFound = UserServiceImp.selectUserById(userId1);
					if (userFound != null) {
						System.out.println(userFound);
					} else {
						System.err.println("User not found");
					}
					break;

				case 5: {
					List<Users> userList = UserServiceImp.selectAllUsers();
					for (Users u : userList) {
						System.out.println(u);
					}
					break;
				}

				case 6:
					flag = false;
					break;

				default:
					System.out.println("Invalid choice. Please try again.");
				}
			} catch (Exception e) {
				System.err.println("Error: " + e.getMessage());
				scanner.nextLine();
			}
		}
		scanner.close();
	}

	private static Users readUserData() {
		Users user = new Users();
		System.out.println("Enter User ID");
		user.setUserID(scanner.nextInt());

		System.out.println("Enter Email Address");
		user.setEmailAddress(scanner.next());

		System.out.println("Enter Contact Number");
		user.setContactNo(scanner.next());

		System.out.println("Enter Password");
		user.setPassword(scanner.next());

		return user;
	}
}
