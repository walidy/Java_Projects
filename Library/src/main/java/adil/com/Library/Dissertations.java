package adil.com.Library;

public class Dissertations extends Items {

	private String format;

	public Dissertations(String author, int yearPublished, int itemID, String format) {
		super(author, yearPublished, itemID);
		this.format = format;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void borrowItems() {
		// TODO Auto-generated method stub
		
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

}
