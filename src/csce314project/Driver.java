package csce314project;

import java.util.*;
import java.io.IOException;
import csce314project.treeNode.nodeType;

/*
File: Driver.java
Project: CSCE 314 Project, Fall 2020
Author: Shikhar Baheti & Gilbert Gonzalez
Date: 11/23/2020
Section: 512
E-mail: gilbertglz@tamu.edu & shikhar@tamu.edu
This file contains the main driver program for the final project in CSCE 314.
The idea revolves around a Bank having two or more Users who visit business
and make transactions using some form of payment method we can track. When
does a user make a transaction? Whenever the hashes of the nodes at the very
bottom change. We take as inputs User names, types of payments, transaction
information
*/

public class Driver {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws IOException {
		// asks the user to input an username
		System.out.print("Welcome to the Aggie Bank! Please input your username: ");

		Scanner scan = new Scanner(System.in);
		String userName = scan.nextLine();

		// instantiates a root for the Merkle Tree
		treeNode root = new treeNode(nodeType.Root, 1);
		BankDatabase bankDB = new BankDatabase();
		String fullName = "";

		bankDB.addUser("shikhar2000", "Shikhar Baheti");

		if (!bankDB.checkUserName(userName).equals("NULL")) {
			fullName = bankDB.checkUserName(userName);
			System.out.println("Welcome back " + fullName + "! You have cash and credit available.");
		} else {
			System.out.println("Hello, " + userName
					+ "! You are currently not in our bank system. Would you like to create an account with us? Y/N");
			{
				String option = scan.nextLine().toLowerCase();
				if (option != null && option.equals("y")) {
					System.out.println("Please input your full name in the format: \"Firstname Lastname\":");
					String name = scan.nextLine();
					bankDB.addUser(userName, name);
					fullName = bankDB.checkUserName(userName);
					System.out.println(
							"Thank you for joining Aggie Bank, " + fullName + "! You have cash and credit available.");
				}
			}
		}

		// creates a new user with the username provided by the user
		User user1 = new User("shikhar2000");
		User user2 = new User(userName);

		// adds the user to our Merkle Tree
		root.addUser(user1);
		root.addUser(user2);

		PaymentMethod cash1 = new PaymentMethod("cash");
		cash1.addTransNode(new Transaction(user1.toString(), root));

		// cash1.addTransNode(new Business(amount,dateSpent, payMethod,b_name));
		PaymentMethod card1 = new PaymentMethod("card");
		card1.addTransNode(new Transaction(user1.toString(), root));

		PaymentMethod cash2 = new PaymentMethod("cash");
		cash2.addTransNode(new Transaction(user2.toString(), root));

		PaymentMethod card2 = new PaymentMethod("card");
		card2.addTransNode(new Transaction(user2.toString(), root));

		user1.addPaymentMethod(cash1);
		user1.addPaymentMethod(card1);

		user2.addPaymentMethod(cash2);
		user2.addPaymentMethod(card2);

		root.printTree();

		// @TODO:
		// Check if user previously exists from a list of users
		// if not then make new user

		User selUser;
		User rootUserL = (User) root.leftNode;
		User rootUserR = (User) root.rightNode;
		if (rootUserL.getUserName().equals(userName)) {
			selUser = rootUserL;
		} else {
			selUser = rootUserR;
		}

//		System.out.println(selUser.getUserName());

		System.out.println("Do you want to make a transaction, " + userName + "? Y/N");
		String checkTrans = scan.nextLine().toLowerCase();

		if (checkTrans != null && checkTrans.equals("y")) {

			// @TODO:
			// add transaction to the tree
			System.out.println("Please enter an amount: ");
			double amount = (double) scan.nextDouble();

			System.out.println("Payment Method: Cash (1) or Credit (2) ?");
			int payMethod = scan.nextInt();
			if (payMethod == 1) {
				// Adds Transaction to certain
				// find user USES NEW USER HERE
				System.out.println("ROOT's hashval in the beginning: " + root.hashVal);
				Transaction transNode = (Transaction) selUser.leftNode.leftNode; // access the TransactionNode
				// add TransactionType info=

				transNode.addTransaction("date", amount, fullName);
				System.out.println("BEFORE : " + transNode.hashVal);
			} else if (payMethod == 2) {
				// find user
				// access the payMthd
				// add Transaction

			} else {
				// error on input or exit
			}

//			Transaction newTrans = new Transaction(userName);
//                        
//                        cash1.addTransNode(newTrans);

			// root.addChild(newTrans);
			System.out.println("The user has successfully made a transaction of $" + amount);

			// Adding new transaction
			/* Add the amount of money, the date, & assign hash value */

		}
		// user didn't make a transaction just exit
		else {
			System.exit(0);
		}
		System.out.println(
				"ROOT's hashval in the end: " + root.hashVal + " which should be equal to the below two added: ");
		System.out.println(user1.hashVal);
		System.out.println(user2.hashVal);
	}

}
