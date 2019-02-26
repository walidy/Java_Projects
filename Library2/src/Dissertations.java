
public class Dissertations extends LibraryItems {

	private String format = " ";

	public Dissertations(String name, String author, int yearPublished, String format) {
		super(name, author, yearPublished);
		this.format = format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getFormat() {
		return format;
	}

	public String getDissertationsName() {
		return getName();
	}

	public String getDissertationsAuthor() {
		return getAuthor();
	}

	public int getDissertationsYearPublished() {
		return getYearPublished();
	}

	public int getDissertationsItemID() {
		return getItemID();
	}

}
