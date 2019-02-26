public class Books extends LibraryItems {

	private String coverType = " ";

	public Books(String name, String author, int yearPublished, String coverType) {
		super(name, author, yearPublished);
		this.coverType = coverType;
	}

	public void setCoverType(String coverType) {
		this.coverType = coverType;
	}

	public String getCoverType() {
		return coverType;
	}

	public String getBooksName() {
		return getName();
	}

	public String getBookAuthor() {
		return getAuthor();
	}

	public int getBookYearPublished() {
		return getYearPublished();
	}

	public int getBookItemID() {
		return getItemID();
	}

}
