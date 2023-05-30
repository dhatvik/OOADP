package ObservarPattern;

public class ObserverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FestivalSubject sub=new FestivalSubject();
		Customer c1=new Customer("Dhatvik MP");
		Customer c2=new Customer("Nandan N");
		sub.Subscribe(c1);
		sub.Subscribe(c2);
		sub.FestiveDiscount("Diwali", 15);
		sub.UnSubscribe(c2);
		sub.FestiveDiscount("Ugadi", 20);
	}

}
