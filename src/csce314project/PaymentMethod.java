package csce314project;

import java.util.*;

/*
File: PaymentMethod.java
Project: CSCE 314 Project, Fall 2020
Author: Shikhar Baheti & Gilbert Gonzalez
Date: 11/23/2020
Section: 512
E-mail: gilbertglz@tamu.edu & shikhar@tamu.edu
This file contains the PaymentMethod class. This node has the name of the
payment type we're accessing. Card, Cash, Bitcoin , etc.
*/

// example of Inheritance
public class PaymentMethod extends treeNode {

	String addedPaymentType;


	// default constructor of the PaymentMethod class
	public PaymentMethod(String paymentType) {
		super(nodeType.PaymentMethod, 1234);
		this.addedPaymentType = paymentType;
	}
        public String getPaymentType()
        {
            return this.addedPaymentType;
        }

	public String getPaymentMethodType() {
		return this.addedPaymentType;
	}

	protected void updateParentHash() {
		super.setHashVal();
	}

	protected void setHashVal() {
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

	// Do we already have a given type trying to be accessed?
	void checkForType() {
	};

	// @TODO: Add Type
	void addType() {
	}

	// @TODO: Add Type
	void removeType() {
	}

	// @TODO:
	// We add businesses below this node because we track what business I paid
	// with what kind of payment method

	void addTransNode(Transaction transaction) {
		if (this.checkLeftEmpty()) {
			this.leftNode = transaction;
		} else if (this.checkRightEmpty()) {
			this.rightNode = transaction;
		}
	}

}
