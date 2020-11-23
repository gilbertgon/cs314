package csce314project;

public abstract class TransactionType {

	double amount;
	String date;
	String about;

	public TransactionType(double amount, String date, String about) {
		this.amount = amount;
		this.date = date;
		this.about = about;
	}

}
