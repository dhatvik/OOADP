package ObservarPattern;

public abstract class Subject {
	abstract void Subscribe(Customer c);
	abstract void UnSubscribe(Customer c);
	abstract void FestiveDiscount(String Festival,int Discount);
}
