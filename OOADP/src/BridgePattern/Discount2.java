package BridgePattern;

public class Discount2 implements Discount {
	public double Calc(double price) {
		System.out.println("20% Discount is Given");
		return price*0.80;
	}


}
