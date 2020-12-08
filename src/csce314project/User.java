package csce314project;

import java.util.*;

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

	// default Constructor for User class
	public User(String name) {
		super(nodeType.User, 1234);
		this.userName = name;
	}

	// returns the username of the User
	String getUserName() {
		return this.userName;
	}

	protected void updateParentHash() {
		super.setHashVal();
	}

	protected void setHashVal() {
		System.out.println("USER SET HASH");
		int l = 0;
		int r = 0;
		if (!this.leftNode.checkLeftEmpty()) {
			l = this.leftNode.getLeftHashVal();
		}
		if (!this.rightNode.checkRightEmpty()) {
			r = this.rightNode.getRightHashVal();
		}
		this.hashVal = l + r;
	}

	protected int getLeftHashVal() {
		if (!this.checkLeftEmpty()) {
			return this.leftNode.hashVal;
		} else {
			return 0;
		}
	}

	protected int getRightHashVal() {
		if (!this.checkRightEmpty()) {
			return this.rightNode.hashVal;
		} else {
			return 0;
		}
	}

	// Example of Abstraction from parent TreeNode
	public int updateHashVal() {
		this.hashVal = getLeftHashVal() + getRightHashVal();
		return this.hashVal;
	}

	// @TODO:
	// We add mehod here to a specific user but not all users.
	void addPaymentMethod(PaymentMethod PaymentMethod) {
		if (this.checkLeftEmpty()) {
			this.leftNode = PaymentMethod;
		} else if (this.checkRightEmpty()) {
			this.rightNode = PaymentMethod;
		}
	}

}
