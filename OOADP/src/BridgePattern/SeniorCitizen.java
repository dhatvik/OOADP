package BridgePattern;

public class SeniorCitizen extends Customer{
	
	SeniorCitizen(Discount d){
		super(d);
	}
	
	public double Calculate(double price) {
		System.out.println("Welcome SeniorCitizens");
		return d.Calc(price);
	}
}
