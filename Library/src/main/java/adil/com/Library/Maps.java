package adil.com.Library;

public class Maps extends Items {

	private boolean canCopy;

	public Maps(String author, int yearPublished, int itemID, boolean canCopy) {
		super(author, yearPublished, itemID);
		this.canCopy = canCopy;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void borrowItems() {
		// TODO Auto-generated method stub
		
	}

	public boolean getCopy() {
		return canCopy;
	}

	public void setCopy(boolean copy) {
		this.canCopy = canCopy;
	}

}
