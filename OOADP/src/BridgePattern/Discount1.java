package BridgePattern;

public class Discount1 implements Discount {

	public double Calc(double price) {
		System.out.println("15% Discount is Given");
		return price*0.85;
	}

}
