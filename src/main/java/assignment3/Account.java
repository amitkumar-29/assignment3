package assignment3;
import java.util.Date;
public class Account {
private String name;
private String address;
private float balance_amt;
Date date;
private String status;
private String type;
public Account(String name, String address, float balance_amt, Date date, String status, String type) {
	super();
	this.name = name;
	this.address = address;
	this.balance_amt = balance_amt;
	this.date = date;
	this.status = status;
	this.type = type;
}
	
}
