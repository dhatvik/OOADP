package FactoryPattern;
import java.util.*;
public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of Customer");
		String name=sc.next();
		CustomerFactory cf=new CustomerFactory();
		Customer c1=cf.getCustType(name);
//		Customer c2=cf.getCustType("Senior_Citizen");
//		Customer c3=cf.getCustType("First_Time");
		c1.getType();
//		c2.getType();
//		c3.getType();
	}

}
