package ObservarPattern;

public class Customer {
	String name;
	Customer(String name){
		this.name=name;
	}
	void Update(String Festival,int Discount) {
		System.out.println("Welcome  "+name+"On the event of  "+Festival+"You Got a discount of  "+Discount+ "%");
	}
}
