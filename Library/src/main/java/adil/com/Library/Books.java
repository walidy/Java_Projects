package adil.com.Library;

public class Books extends Items {

	private String backType;
	
	public Books(String author, int yearPublished, int itemID, String backType) {
		super(author, yearPublished, itemID);
		this.backType = backType;
		// TODO Auto-generated constructor stub
	}

	private String type;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

	public void borrowItems() {
		// TODO Auto-generated method stub
		
	}

	public void setBackType(String backType) {
		// TODO Auto-generated method stub
		
		
		this.backType = backType;
	}

	public String getBackType() {
		// TODO Auto-generated method stub
		return backType;
	}

	public void addItems() {
		// TODO Auto-generated method stub

	}
	
	

}
