package csce314project;

/*
File: User.java
Project: CSCE 314 Project, Fall 2020
Author: Shikhar Baheti & Gilbert Gonzalez
Date: 11/23/2020
Section: 512
E-mail: gilbertglz@tamu.edu & shikhar@tamu.edu
This file contains the User class.
We must have a name for a user.
*/

public class User extends treeNode {
	String userName;
	String below = "paymethod";

	// default Constructor for User class
	public User(String name) {
		super(nodeType.User, 1234);
		this.userName = name;
	}

	// returns the username of the User
	String getUserName() {
		return this.userName;
	}

	// Example of Abstraction from parent TreeNode
	void updateToRoot() {
		//this.setParentHash(hashCode());
	}

	// @TODO:
	// We add mehod here to a specific user but not all users.
	void addPaymentMethod(PaymentMethod PaymentMethod) {
		if (this.checkLeftEmpty()) {
			this.leftNode = PaymentMethod;
		}
		else if (this.checkRightEmpty()) {
			this.rightNode = PaymentMethod;
		}
	}

}
