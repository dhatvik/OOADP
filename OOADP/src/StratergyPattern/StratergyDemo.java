package StratergyPattern;

public class StratergyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrinclipleStratergy rc=new regular();
		PrinclipleStratergy sc= new Senior_Citizen();
		
		Context c1=new Context(rc);
		c1.Calculate(2100);
		
		Context c2=new Context(sc);
		c2.Calculate(2100);
		
		
	}

}
