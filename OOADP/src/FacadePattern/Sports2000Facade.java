package FacadePattern;


public class Sports2000Facade {
	
	 ItemPurchased i;
	 Sports2000ProcessSale s;
	
	Sports2000Facade(boolean b,float f){
		i=new ItemPurchased();
		s=new Sports2000ProcessSale(b,f,i.getTypeCount());
	}
	
	public void DisplayItem() {
		i.showItems();
	}
	public void DisplayAmount() {

		s.processSale();
	}

}
