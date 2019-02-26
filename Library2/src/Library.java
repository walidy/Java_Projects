import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

	List<LibraryItems> libraryItemsList = new ArrayList<LibraryItems>();
	List<LibraryMembers> libraryMembersList = new ArrayList<LibraryMembers>();
	List<LibraryItems> libraryCheckOutList = new ArrayList<LibraryItems>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public void setItemsList(List<LibraryItems> libraryItemsList) {
		this.libraryItemsList = libraryItemsList;
	}

	public List<LibraryItems> getItemsList() {
		return libraryItemsList;
	}

	public void addItems(LibraryItems items) {
		libraryItemsList.add(items);
	}

	public void removeItems(LibraryItems items) {
		libraryItemsList.remove(items);
	}

	public void updateItem(LibraryItems items) {
		System.out.println("\nPlease enter the new name of the item: ");
		Scanner name = new Scanner(System.in);
		String newName = name.nextLine();
		items.setName(newName);
	}

	public void setMembersList(List<LibraryMembers> libraryMembersList) {
		this.libraryMembersList = libraryMembersList;
	}

	public List<LibraryMembers> getMembersList() {
		return libraryMembersList;
	}

	public void addMembers(LibraryMembers members) {
		libraryMembersList.add(members);
	}

	public void removeMembers(LibraryMembers members) {
		libraryMembersList.remove(members);
	}
	
	public void updateMembers(LibraryMembers members) {
		System.out.println("\nPlease enter the new name of the Member: ");
		Scanner membersScanner = new Scanner(System.in);
		String newMembersName = membersScanner.nextLine();
		members.setMemberName(newMembersName);
	}

	public void setCheckOutList(List<LibraryItems> libraryCheckOutList) {
		this.libraryCheckOutList = libraryCheckOutList;
	}

	public List<LibraryItems> getCheckOutList() {
		return libraryCheckOutList;
	}

	public void CheckOut(LibraryItems items) {
		libraryItemsList.remove(items);
		libraryCheckOutList.add(items);
	}

	public void checkIn(LibraryItems items) {
		libraryCheckOutList.remove(items);
		libraryItemsList.add(items);
	}

}
