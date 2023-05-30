package TemplatePattern;

public class TemplateDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		OnlineOrderProcess online=new OnlineOrderProcess();
		online.processOrder();
		Thread.sleep(3000);
		OfflineOrderProcess offline=new OfflineOrderProcess();
		offline.processOrder();
	}

}
