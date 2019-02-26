public class Maps extends LibraryItems {

	private Boolean canCopy = true;

	public Maps(String name, String author, int yearPublished, Boolean canCopy) {
		super(name, author, yearPublished);
		this.canCopy = canCopy;
	}

	public void setCanCopy(Boolean canCopy) {
		this.canCopy = canCopy;
	}

	public Boolean getCanCopy() {
		return canCopy;
	}

	public String getMapsName() {
		return getName();
	}

	public String getMapsAuthor() {
		return getAuthor();
	}

	public int getMapsYearPublished() {
		return getYearPublished();
	}

	public int getMapsItemID() {
		return getItemID();
	}

}
