package BridgePattern;

public class BridgeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new regular(new Discount1());
		System.out.println("Amount to be paid by regular customer after Discount1 is"+c1.Calculate(100));
		Customer c2=new regular(new Discount2());
		System.out.println("Amount to be paid by regular customer after Discount2 is"+c2.Calculate(100));
		
		Customer c3=new SeniorCitizen(new Discount1());
		System.out.println("Amount to be paid by SeniorCitizens after Discount1 is"+c3.Calculate(100));
		
		Customer c4=new FirstTime(new Discount2());
		System.out.println("Amount to be paid By First Time Customer after Discount2 is"+c4.Calculate(100));
	}

}
