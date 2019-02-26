
public class PrintNumbers {
	public static void main(String [] args) {

		tenNumbers();
		betweenHundredAndThousand();
	}
	
	public static void tenNumbers() {
	
		for (int i = 0; i <= 10 ; i++) {
			System.out.println(i);
		}
	}
	
	public static void betweenHundredAndThousand() {
		for (int i= 100; i < 1000; i++) {
			System.out.println(i);
		}
	}
	
	
}

