package TemplatePattern;

public abstract class OrderProcess {
	public void processOrder() {
		SelectItem();
		doPayment();
		doDilivery();
	}
	abstract void SelectItem();
	abstract void doPayment();
	abstract void doDilivery();
}
