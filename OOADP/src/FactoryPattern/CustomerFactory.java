package FactoryPattern;

public class CustomerFactory {
	Customer getCustType(String type) {
		if(type.equalsIgnoreCase("Bharath")) {
			return new regular();
		}
		else if(type.equalsIgnoreCase("Nandan")) {
			return new Senior_citizen();
		}
		else
			return new First_time();
	}
}
