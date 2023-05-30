package TemplatePattern;
import java.util.*;
public class OnlineOrderProcess extends OrderProcess{
	int billamt;
	void SelectItem() {
		System.out.println("Welcome to Online Store");
		System.out.println("Items Choosen");
		System.out.println("1.Book Rs200");
		System.out.println("2.Pen Rs400");
		billamt=200+400;
	}
	void doPayment() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Payment Mode\n 1.UPI \n2.NetBanking");
		sc.next();
	}
	void doDilivery() {
		String s="MSRIT";
		int diliverycharges=100;
		System.out.println("Dilivery Charges for Your Location "+s+"is Rs"+diliverycharges);
		System.out.println("Total Amount to be paid is Rs "+(billamt+diliverycharges));
	}
}
