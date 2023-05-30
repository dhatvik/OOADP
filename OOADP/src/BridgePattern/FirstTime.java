package BridgePattern;

public class FirstTime extends Customer {

	FirstTime(Discount d){
		super(d);
	}
	
	public double Calculate(double price) {
		System.out.println("Welcome First Time Customers");
		return d.Calc(price);
	}
}
