package BridgePattern;

public abstract class Customer {
	Discount d;
	Customer(Discount d){
		this.d=d;
	}
	abstract double Calculate(double price);

}
