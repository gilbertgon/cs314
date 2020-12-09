package csce314project;

/*
File: treeNode.java
Project: CSCE 314 Project, Fall 2020
Author: Shikhar Baheti & Gilbert Gonzalez
Date: 11/23/2020
Section: 512
E-mail: gilbertglz@tamu.edu & shikhar@tamu.edu
This file contains the treeNode class for the final project in CSCE 314. This
is the basis of our tree. All nodes have a type designation, but also have a
hash value. We generate our hashValue here as well. Our root (Bank) will be
made here as well considering it is the one of kind factor.
*/

public class treeNode {

	// defines different types of possible Nodetypes
	public enum nodeType {
		Root, Transaction, User, PaymentMethod;
	}

	nodeType typeOfNode;
	protected int hashVal;
	protected treeNode leftNode;
	protected treeNode rightNode;
	private treeNode rootNode;
	private treeNode tail;
	private int parentHash;
	String below;

	// In a binary tree we would go Left and Right, here we store the address
	// of the children node below us.

	// default constructor of the treeNode class
	public treeNode(nodeType type, int hashVal) {
		this.hashVal = hashVal;
		this.typeOfNode = type;
		leftNode = null;
		rightNode = null;
		parentHash = 0;
		tail = this;
		if (this.typeOfNode == nodeType.Root) {
			rootNode = this;
		}
		setBelow(this.typeOfNode);
	}

	// defines the hierarchy of each node of the Merkle Tree
	public void setBelow(nodeType type) {
		switch (type) {
		case Root:
			this.below = "User";
			break;
		case Transaction:
			this.below = "None";
			break;
		case User:
			this.below = "PaymentMethod";
			break;
		case PaymentMethod:
			this.below = "Transaction";
			break;
		}

	}

	// @TODO:
	void removeChild() {
	}

	// returns the nodeType of a node
	public nodeType getNodeType() {
		return this.typeOfNode;
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

	protected void updateHashVal() {
		if (!(this instanceof Transaction)) {
			this.hashVal = 0;
		}
		if (!this.checkLeftEmpty()) {
			this.leftNode.updateHashVal();
//			System.out.println("User left hash: " + this.leftNode.hashVal + " made from, " + this.leftNode.getClass());
			this.hashVal += this.leftNode.hashVal;
		}
		if (!this.checkRightEmpty()) {
			this.rightNode.updateHashVal();
//			System.out.println("User right hash: " + this.rightNode.hashVal + " made from, " + this.rightNode.getClass());
			this.hashVal += this.rightNode.hashVal;
		}
	}

	// returns the node below the current node
	public String getBelow() {
		return this.below;
	}

	void addUser(User userNode) {
		if (rootNode.checkLeftEmpty()) {
			rootNode.leftNode = userNode;
		} else if (rootNode.checkRightEmpty()) {
			rootNode.rightNode = userNode;
		}
	}

	// adds children to the current tree node
	void addChild(treeNode addedNode) {
		treeNode temp = rootNode.tail;
		if (temp.checkLeftEmpty() && temp.getBelow() == addedNode.typeOfNode.toString()) {
			temp.leftNode = addedNode;
			rootNode.tail = addedNode;

		} else if (temp.checkRightEmpty() && temp.getBelow() == addedNode.typeOfNode.toString()) {
			temp.rightNode = addedNode;
			rootNode.tail = addedNode;
		}
	}

	public boolean checkLeftEmpty() {
		return this.leftNode == null;
	}

	public boolean checkRightEmpty() {
		return this.rightNode == null;
	}

	public void printTree() {
		System.out.println("<----------------------------- PRINTING TREE ----------------------------->");

		System.out.println("User 1: " + ((User) this.leftNode).getUserName());
		System.out.println("User 2: " + ((User) this.rightNode).getUserName());
		System.out.println(
				"User 1's first payment method: " + ((PaymentMethod) this.leftNode.leftNode).getPaymentMethodType());
		System.out.println(
				"User 1's second payment method: " + ((PaymentMethod) this.leftNode.rightNode).getPaymentMethodType());
		System.out.println(
				"User 2's first payment method: " + ((PaymentMethod) this.rightNode.leftNode).getPaymentMethodType());
		System.out.println(
				"User 2's second payment method: " + ((PaymentMethod) this.rightNode.rightNode).getPaymentMethodType());

		System.out.println("User 1's first Cash Transaction Node: " + this.leftNode.leftNode.leftNode);
		System.out.println("User 1's first Credit Transaction Node: " + this.leftNode.rightNode.leftNode);

		System.out.println("User 2's first Cash Transaction Node: " + this.rightNode.leftNode.leftNode);
		System.out.println("User 2's first Credit Transaction Node: " + this.rightNode.rightNode.leftNode);

		System.out.println("<----------------------------- END PRINTING TREE ----------------------------->");
	}

// @TODO:
// Print my tree
//	public boolean print() {
//		while (this != tail) {
//			treeNode tempL = this.leftNode;
//			System.out.println(this.nodeType1.toString());
//			if (!this.checkLeftEmpty()) {
//				System.out.println("We went left");
//				System.out.println(tempL.nodeType1);
//				tempL.print();
//
//			}
//
//			treeNode tempR = this.rightNode;
//			if (!this.checkRightEmpty()) {
//				System.out.println("We went right");
//				System.out.println(tempR.nodeType1);
//
//			}
//            else
//            {
//                tail=temp;
//            }
//            if(!temp.checkRightEmpty())
//            {
//                System.out.println("we went right");             
//                System.out.println(tempR.nodeType1);
//                tempR.print();
//            }
//            else
//            {
//                rootNode.tail=tempL;
//                return false;
//            }
//	}

//	return false;}

	// returns the root of the node
	public treeNode getRoot() {
		return this.rootNode;
	}

	// @TODO:
	// Generates a hash Value for our node regardless of type
	public int hashGenerator() {
		return 0;
	}
}
