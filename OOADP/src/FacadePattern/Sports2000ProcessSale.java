package FacadePattern;
import java.util.Scanner;
public class Sports2000ProcessSale {
	boolean giftcert;
	float billamt;
	int qty;
	public Sports2000ProcessSale(boolean giftcert, float billamt, int qty) {
		super();
		this.giftcert = giftcert;
		this.billamt = billamt;
		this.qty = qty;
	}
	public void processSale() {
	if(!giftcert) {
		System.out.println("No Gift Certificate available");
		System.out.println("Amount to be paid is "+billamt);
	}
	else {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of gift certificate");
		float certvalue=sc.nextFloat();
		if(certvalue>billamt) {
			System.out.println("Excess amount will not be refumded");
		}
		else if(certvalue<billamt) {
			System.out.println("Remaining amount need to pay via cash"+(billamt-certvalue));
		}
		else if(qty==0) {
			System.out.println("No item selected");
		}
		else if(qty>1) {
			System.out.println("Only one item can be purchased");
		}
	}
	}
	
}
