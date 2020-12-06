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
		Root, Transaction, Business, User, PaymentMethod;
	}

	nodeType nodeType1;
	int hashVal;
	private treeNode leftNode;
	private treeNode rightNode;
	private treeNode rootNode;
	private treeNode tail;
	private int parentHash;
	String below;

	public void setParentHash(int hash) {
		this.parentHash = hash;
	}

	// In a binary tree we would go Left and Right, here we store the address
	// of the children node below us.

	// default constructor of the treeNode class
	public treeNode(nodeType type, int hashVal) {
		this.hashVal = hashVal;
		this.nodeType1 = type;
		leftNode = null;
		rightNode = null;
		parentHash = 0;
		tail = this;
		if (this.nodeType1 == nodeType.Root) {
			rootNode = this;
		}
		setBelow(this.nodeType1);
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
		case Business:
			this.below = "Transaction";
			break;
		case User:
			this.below = "PaymentMethod";
			break;
		case PaymentMethod:
			this.below = "Business";
			break;
		}

	}

	// @TODO:
	void removeChild() {
	}

	// returns the nodeType of a node
	public nodeType getNodeType() {
		return this.nodeType1;
	}

	// returns the node below the current node
	public String getBelow() {
		return this.below;
	}

	// adds children to the current tree node
	void addChild(treeNode addedNode) {
		treeNode temp = rootNode.tail;
		if (temp.checkLeftEmpty() && temp.getBelow() == addedNode.nodeType1.toString()) {
			rootNode.tail = addedNode;

		} else if (temp.checkRightEmpty() && temp.getBelow() == addedNode.nodeType1.toString()) {
			temp.rightNode = addedNode;
			rootNode.tail = addedNode;
		}

	}

	// What are the children below my current node?
	// public ArrayList<User> getChildren() {
	// return children;
	// }

	public boolean checkLeftEmpty() {
		return this.leftNode == null;
	}

	public boolean checkRightEmpty() {
		return this.rightNode == null;
	}

	// @TODO:
	// Print my tree
	public boolean print() {
		while (this != tail) {
			treeNode tempL = this.leftNode;
			System.out.println(this.nodeType1.toString());
			if (!this.checkLeftEmpty()) {
				System.out.println("We went left");
				System.out.println(tempL.nodeType1);
				tempL.print();

			}

			treeNode tempR = this.rightNode;
			if (!this.checkRightEmpty()) {
				System.out.println("We went right");
				System.out.println(tempR.nodeType1);

			}

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
		}

		return false;
	}

	// returns the root of the node
	public treeNode getRoot() {
		return this.rootNode;
	}

	// @TODO:
	// update our tree when we change hash value
	void updateToRoot() {
	}

	// @TODO:
	// Generates a hash Value for our node regardless of type
	public int hashGenerator() {
		return 0;
	}
}
