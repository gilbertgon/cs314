package javaapplication10;

/*
File: TransactionType.java
Project: CSCE 314 Project, Fall 2020
Author: Shikhar Baheti & Gilbert Gonzalez
Date: 11/23/2020
Section: 512
E-mail: gilbertglz@tamu.edu & shikhar@tamu.edu
This file contains the TransactionType class for the final project in CSCE
314. This class has enables us to store different types of transactions based
on their date, amount, and details.
*/

public abstract class TransactionType {

	private double amount;
	private String date;
	private String about;

	// default constructor of the TransactionType class
	public TransactionType(double amount, String date, String about ) {
		this.amount = amount;
		this.date = date;
		this.about = about;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

}