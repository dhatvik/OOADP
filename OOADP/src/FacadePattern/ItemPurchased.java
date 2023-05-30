package FacadePattern;
import java.util.*;
public class ItemPurchased {
HashMap<String,Integer>hm ;
int type;
String name;
int qty;
ItemPurchased() {
	hm=new HashMap<String ,Integer>();
	StorePurchased();
}

public void StorePurchased() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of types of items");
	int type=sc.nextInt();
	for(int i=1;i<=type;i++) {
		String name;
		int qty;
		System.out.println("Enter name of item");
		name=sc.next();
		System.out.println("Enter Quantity");
		qty=sc.nextInt();
		hm.put(name, qty);
	}
	
}

public int getTypeCount() {
	return type;
}

public void showItems() {
	hm.forEach((name,qty)->System.out.println("\nName"+name+"\nQuantity"+qty));
}
}
