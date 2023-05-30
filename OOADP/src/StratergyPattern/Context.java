package StratergyPattern;

public class Context {
	PrinclipleStratergy s;
	StoreLevelDiscount sd=new StoreLevelDiscount();
	
	Context(PrinclipleStratergy s){
		this.s=s;
		
	}
	
	void Calculate(double price) {
		double amt=sd.StoreDiscount(price);
		double cust_disc=s.calc(amt);
		double Total=amt-cust_disc;
		System.out.println("The Price After discount is "+Total);
	}

}
