public class LibraryItems {

	private String name = " ";
	private String author = " ";
	private int yearPublished;
	private static int itemID = 1;

	public LibraryItems(String name, String author, int yearPublished) {
		this.name = name;
		this.author = author;
		this.yearPublished = yearPublished;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setItemID(int itemID) {
		itemID += 1;
		LibraryItems.itemID = itemID;
	}

	public int getItemID() {
		return itemID;
	}

}
