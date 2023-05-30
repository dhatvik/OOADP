package StratergyPattern;

public class StoreLevelDiscount {
	
	double Discount=100;
	double StoreDiscount(double price) {
		if(price>2000)
		{
			price-=Discount;
		}
		return price;
	}

}
