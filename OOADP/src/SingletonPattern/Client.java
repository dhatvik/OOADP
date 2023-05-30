package SingletonPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TabWindow s1=TabWindow.getinstance();
		TabWindow s2=TabWindow.getinstance();
		s1.addurl("www.google.com");
		s2.addurl("www.gmail.com");
		TabWindow s3=TabWindow.getinstance();
		s3.showurl();
	}

}
