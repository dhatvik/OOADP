package BridgePattern;

public class regular extends Customer {
	
	regular(Discount d){
		super(d);
	}
	public double Calculate(double price) {
		System.out.println("Welcome Regular Customers");
		return d.Calc(price);
	}

}
