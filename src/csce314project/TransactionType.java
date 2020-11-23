package csce314project;

public abstract class TransactionType {

	private double amount;
	private String date;
	private String about;

	// default constructor of the TransactionType class
	public TransactionType(double amount, String date, String about) {
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
