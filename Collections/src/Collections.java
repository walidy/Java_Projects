import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

	static int[] numbers = new int[101];
	static List<Integer> numbersList = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addNumbers();
		System.out.println(Arrays.toString(numbers));
		addNumbersList().forEach(System.out::println);
	}

	static int[] addNumbers() {

		for (int i = 0; i <= 99; i++) {
			numbers[i] = i + 1;
		}
		return numbers;

	}
	
	static List<Integer> addNumbersList() {
		int result;
		for (int i = 0; i <= 900; i++) {
			  result = i + 100;
			numbersList.add(result);
		}
		return numbersList;
	}
	
	static void multiplyNumbersList() {
		addNumbersList().get(0);
	}

}
