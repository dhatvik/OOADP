package TemplatePattern;

import java.util.Scanner;

public class OfflineOrderProcess extends OrderProcess{
	int billamt;
	void SelectItem() {
		System.out.println("Welcome to Offline Store");
		System.out.println("Items Choosen");
		System.out.println("1.Ghee Rs2000");
		System.out.println("2.Butter Rs1500");
		billamt=2000+1500;
	}
	void doPayment() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Payment Mode\n1.Cash \n2.Card");
		sc.next();
	}
	void doDilivery() {
		System.out.println("Dilivery will be given in counter No 1 Please Go and Collect");
		System.out.println("Total Amount to be paid is Rs "+billamt);
	}
	
}
