import java.util.Scanner;

public class Runner {

	static Books Alchemist = new Books("The Alchemist", "Paulo Coelho", 1988, "Hard Back");
	static Books Monk = new Books("The Monk Who Sold His Ferrari", "Robin Sharma", 1996, "Paper Back");

	static Maps Mauritius = new Maps("Mauritius Map", "Mr. Mauritius", 1900, false);
	static Maps UK = new Maps("United Kingdom Map", "Mr. UK", 1944, true);

	static Dissertations MathsWiz = new Dissertations("Maths Wiz", "Adil Oozeerally", 2018, "Digital");
	static Dissertations Breathe = new Dissertations("Breathe", "Leon Xavier", 2018, "Physical");

	static LibraryMembers Adil = new LibraryMembers("Adil Oozeerally", 1);
	static LibraryMembers Adonay = new LibraryMembers("Adonay Ghebremedhin", 2);
	static LibraryMembers Ahmed = new LibraryMembers("Ahmed Osman", 3);

	static Library library = new Library();

	public static void main(String[] args) {

		library.addItems(Alchemist);
		library.addItems(Monk);
		library.addItems(Mauritius);
		library.addItems(UK);
		library.addItems(MathsWiz);
		library.addItems(Breathe);

		library.addMembers(Adil);
		library.addMembers(Adonay);
		library.addMembers(Ahmed);

		libraryMenu();

	}

	public static void libraryMenu() {

		System.out.println(
				"\nLibrary Menu:\nPlease choose an option:\n(1) List of Library Items\n(2) List of Library Members\n(3) Check Out an Item\n(4) Check In an Item\n(5) Update an item\n(6) Remove Library Member\n(7) Update Library Member\n-------------||------------- ");

		Scanner optionScanner = new Scanner(System.in);
		int option = optionScanner.nextInt();

		switch (option) {
		case 1:
			System.out.println("The Library contains the following items: \n");
			library.libraryItemsList.forEach(i -> System.out.println(i.getName() + "(" + i.getItemID() + ")"));
			break;

		case 2:
			System.out.println("\nThe library has the following members: \n");
			library.libraryMembersList.forEach(i -> System.out.println(i.getMemberName() + ", ID: " + i.getMemberID()));
			break;

		case 3:
			System.out.println("\nThe following items have been checked out of the Library: \n");
			library.CheckOut(MathsWiz);
			library.libraryCheckOutList.forEach(i -> System.out.println(i.getName()));
			break;

		case 4:
			library.checkIn(MathsWiz);
			break;

		case 5:
			library.updateItem(Alchemist);
			break;

		case 6:
			library.removeMembers(Adonay);
			break;

		case 7:
			library.updateMembers(Ahmed);
			break;
			
		default:
			System.out.println("Please enter a correct Menu Option (1,2,3,4, 5, 6, 7):");
			libraryMenu();
		}
		libraryMenu();
	}

}
