package csce314project;

import java.util.ArrayList;
//import java.util.Vector;

/*
File: Transaction.java
Project: CSCE 314 Project, Fall 2020
Author: Shikhar Baheti & Gilbert Gonzalez
Date: 11/23/2020
Section: 512
E-mail: gilbertglz@tamu.edu & shikhar@tamu.edu
This file contains the Transaction class for the final project in CSCE 314.
This class has a transactionList vector to continously add more transactions
under the same business. We want to keep a date of our transaction to later
query if needed, as well as the amount the transaction was made of.
*/

public class Transaction extends treeNode {
	String userName = "";

	// creates a Collection of type generic Object
	ArrayList<Object> transactionList = new ArrayList<Object>();

	// Default constructor for Transaction
	public Transaction(String userName) {
		super(nodeType.Transaction, 1234);
		this.hashVal = transactionList.hashCode();
	}

	// returns the object below the treenode
	public String getBelow() {
		return this.below;
	}

	// appends a new transaction into the trasaction vector
	public void addTransaction(String name, double value, String date) {
		TransactionType transactionReciept = new TransactionType(value, date, name);
		transactionList.add(transactionReciept);
		this.hashVal = transactionList.hashCode();
		super.updateToRoot();
	}

	// we can generate a new hashvalue if we added a transaction to our list
//	int getHashValue() {
//		return hashVal;
//	}

	// output the Transaction info available for a certain Date
	String getTransInfo(String date) {
		String output = "";
		for (int i = 0; i < transactionList.size(); i++) {
			TransactionType trans = (TransactionType) transactionList.get(i);
			if (trans.getDate() == date) {
				output += trans.getAmount() + " " + trans.getDate();
				return output;
			}
		}
		return output;

	}

}
