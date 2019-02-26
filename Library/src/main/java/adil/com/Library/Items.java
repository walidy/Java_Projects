package adil.com.Library;

import java.util.ArrayList;
import java.util.List;

public abstract class Items implements borrowItems {
	
	private String author;
	private int yearPublished;
	private int itemID;
	static List<Object> itemList = new ArrayList<Object>();
//	List<Object> checkoutList = new ArrayList<Object>();

	public Items(String author, int yearPublished, int itemID) {
		this.author = author;
		this.yearPublished = yearPublished;
		this.itemID = itemID;
		
	}
	

	public void borrow() {
//		itemList.remove(itemID);
//		checkoutList.add(itemID);
		
	}
	
	public void addItems() {
//		itemList.add(itemID);
	}


	public static Object addItem(Books alchemist) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
