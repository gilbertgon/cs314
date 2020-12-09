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
		super(nodeType.PaymentMethod, 3);
		this.addedPaymentType = paymentType;
	}

	public String getPaymentType() {
		return this.addedPaymentType;
	}

	public String getPaymentMethodType() {
		return this.addedPaymentType;
	}

	void addTransNode(Transaction transaction) {
		if (this.checkLeftEmpty()) {
			this.leftNode = transaction;
		} else if (this.checkRightEmpty()) {
			this.rightNode = transaction;
		}
	}

}
