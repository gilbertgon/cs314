package csce314project;
/*
File: Business.java
Project: CSCE 314 Project, Fall 2020
Author: Shikhar Baheti & Gilbert Gonzalez
Date: 11/23/2020
Section: 512
E-mail: gilbertglz@tamu.edu & shikhar@tamu.edu
This file contains Business class, the business must have a name, and we have
a numberOfTransaction under this business variable that is updated after each
new Transaction.
*/

public class Business extends treeNode {
	String businessName;
	int numberOfTrans;
	String below = "trans";

	// default constructor for class Business
	public Business(String businessName) {
		super(nodeType.Business, 1234);
		this.businessName = businessName;
	}

	// returns the Node below the business
	public String getBelow() {
		return this.below;
	}

	// @TODO: add Transaction	
	void addTransaction() {
	}

	int getNumOfTrans() {
		return this.numberOfTrans;
	}

	void setNumOfTrans(int numOfTrans) {
		this.numberOfTrans = numOfTrans;
	}

}
