
public class LibraryMembers {

	private String name = " ";
	private int memberID;

	public LibraryMembers(String name, int memberID) {
		this.name = name;
		this.memberID = memberID;
	}

	public void setMemberName(String name) {
		this.name = name;
	}

	public String getMemberName() {
		return name;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public int getMemberID() {
		return memberID;
	}

}
