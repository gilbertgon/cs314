/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csce314project;

import java.io.IOException;
import java.util.Scanner;

import csce314project.treeNode.nodeType;

/*****************************************
 ** File: Driver.java Project: CSCE 314 Project , Fall 2020 Author: Shikhar
 * Baheti & Gilbert Gonzalez Date: 11/7/2020 Section: 512 E-mail:
 * gilbertglz@tamu.edu & shikhar@tamu.edu
 **
 ** This file contains the main driver program for the final project in CSCE 314.
 ** The idea revolves around a Bank having two or more Users who visit business
 * and make transactions using some form of payment method we can track. When
 * does a user make a transaction? Whenever the hashes of the nodes at the very
 * bottom change. We take as inputs User names, types of payments, transaction
 * information
 **
 ***********************************************/

public class Driver {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws IOException {
		// asks the user to input an username
		System.out.println("Input User Name");
		System.out.println();
		Scanner inputUser = new Scanner(System.in);
		String userName = inputUser.nextLine();

		// instantiates a root for the Merkle Tree
		treeNode root = new treeNode(nodeType.Root, 1234);

		// creates a new user with the username provided by the user
		User newUser = new User(userName);

		// adds the user to our Merkle Tree
		// Mock Stub
		root.addChild(newUser);

		// @TODO:
		// Check if user previously exists from a list of users
		// if not then make new user

		System.out.println(userName + " has Cash & Credit available.");

		// creates two types of payment methods for each user
		PaymentMethod cash = new PaymentMethod("card");
		PaymentMethod card = new PaymentMethod("credit");

		// adds two types of payment methods to each user
		root.addChild(cash);
		root.addChild(card);

		System.out.println("Has " + userName + " made a transaction? Y/N");

		String checkTrans = inputUser.nextLine().toLowerCase();

		if (checkTrans != null && checkTrans.equals("y")) {
			// @TODO:
			// add transaction to the tree
			System.out.println("Please enter an amount: ");
			double amount = (double) inputUser.nextDouble();
			Transaction newTrans = new Transaction(amount, userName);
			root.addChild(newTrans);
			System.out.println("The user has successfully made a transaction of $" + amount);
			/* Ask for business name */
			/* If business name exists, add a new transaction to list */
			// Adding new transaction
			/* Add the amount of money, the date, & assign hash value */

			/* If it doesn't make new business and add new trans */
			// Adding new transaction
			/* Add the amount of money, the date, & assign hash value */
		}
		// user didn't make a transaction just exit
		else {
			System.exit(0);
		}

	}

}
