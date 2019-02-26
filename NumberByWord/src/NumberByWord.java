public class NumberByWord {

	public static void main(String[] args) {
		int n = 0;
		for (int i = 0; i <= 1000; i++) {
			n = i;

			printWord(((n / 1000) % 100), " thousand ");
			printWord(((n / 100) % 10), " hundred ");
			printWord((n % 100), "");
		}

	}
	
	
	public static void printWord(int n, String ch) {

		String one[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

		String ten[] = {"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};

		if (n > 19) {
			System.out.println(ten[n / 10] + "" + one[n % 10]);
		} else {
			System.out.print(one[n]);
		}

		if (n > 0) {
			System.out.print(ch);
		}
	}
	
	
}
