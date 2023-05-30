package AdapterPattern;

public class ApadterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecathlonTaxCal tc=new MauriTaxAdapter();
		double taxamt=tc.CalTax(1000);
		System.out.println("Tax to be paid is "+taxamt+"For the bill amount of Rs1000");
	}

}
