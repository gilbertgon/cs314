/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csce314project;

/*****************************************
 ** File: Driver.java Project: CSCE 314 Project, 
 *  Fall 2020 Author: Shikhar Baheti & Gilbert Gonzalez 
 *  Date: 11/23/2020 Section: 512 
 *  E-mail: gilbertglz@tamu.edu & shikhar@tamu.edu
 *  
 ** This file contains the PaymentMethod class. This node has the name of the
 * payment type we're accessing. Card, Cash, Bitcoin , etc.
 **
 **
 ***********************************************/

// example of Inheritance
public class PaymentMethod extends treeNode {

	String addedPaymentType;
	String below = "business";

	// returns the Node below the current node
	public String getBelow() {
		return this.below;
	}

	// default constructor of the PaymentMethod class
	public PaymentMethod(String paymentType) {
		super(nodeType.PaymentMethod, 1234);
		this.addedPaymentType = paymentType;
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
	void addBusinessVisited() {
	}

}
