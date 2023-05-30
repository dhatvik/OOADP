package FacadePattern;

public class FacadeDemo {
	public static void main(String[] agrs) {

		Sports2000Facade f1=new Sports2000Facade(true,200);
		f1.DisplayItem();
		f1.DisplayAmount();
	}
}
