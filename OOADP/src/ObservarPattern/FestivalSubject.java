package ObservarPattern;
import java.util.*;
public class FestivalSubject {
	ArrayList<Customer>list =new ArrayList<Customer>();
	String curr_fest;
	int curr_disc;
	
	void Subscribe(Customer c) {
		list.add(c);
	}
	void UnSubscribe(Customer c) {
		list.remove(c);
	}
	void FestiveDiscount(String Festival,int Discount) {
		curr_fest=Festival;
		curr_disc=Discount;
		Notify_all();
	}
	
	void Notify_all() {
		for(Customer c:list) {
			c.Update(curr_fest, curr_disc);
		}
	}
}
