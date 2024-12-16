package day13;

public class Account {
     private int accno;
     private String name;
     private double	amount;
     
//   for every variable there should be 2 methods getter and setter
     
//Click on the source on top left third menu , click on generate setters and getters
//     public access modifiers - we can access this methods everywhere 
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
     
     
     
      
      
}
