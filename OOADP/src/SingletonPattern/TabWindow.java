package SingletonPattern;
import java.util.*;
public class TabWindow {
	private static TabWindow sc;
	
	ArrayList<String>urls;
	private TabWindow() {
	urls=new ArrayList<String>();
	}
	
	public static TabWindow getinstance() {
		if(sc==null) {
			sc=new TabWindow();
		}
		return sc;
	}
	
	public void addurl(String url) {
		urls.add(url);
		
	}
	
	public void showurl() {
		for(String u:urls) {
			System.out.println(u);
		}
	}
}
