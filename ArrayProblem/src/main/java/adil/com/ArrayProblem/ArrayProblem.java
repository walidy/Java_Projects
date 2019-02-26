package adil.com.ArrayProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProblem {

	static List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

	static List<Integer> numbersSq = new ArrayList<Integer>();

	static int result;

	static int max = 0;

	static int numStore;

	static int lowest;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numbers);

		EvenNumbers();

		MultipleTen();

		HighestNumber();

		LowestNumber();

		SquareValue();

		numbers.stream();
	}

	static void EvenNumbers() {
		System.out.println("Even numbers of Array: ");
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 0) {
				System.out.println(numbers.get(i) + " ");
			}
		}

	}

	static void MultipleTen() {
		System.out.println("Multiples of Ten: ");
		for (int i = 0; i < numbers.size(); i++) {

			result = numbers.get(i) * 10;

			System.out.println(result + " ");

		}
	}

	static void HighestNumber() {
		System.out.println("The highest number is: ");
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > max) {
				max = numbers.get(i);
			}

		}
		System.out.println(max);
	}

	static void LowestNumber() {
		System.out.println("The lowest number is: ");
		lowest = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			if (numbers.get(i) < lowest) {
				lowest = numbers.get(i);
			}

		}
		System.out.println(lowest);
	}

	static void SquareValue() {
		System.out.println("Squared Values: ");
		for (int i = 0; i < numbers.size(); i++) {

			result = numbers.get(i) * numbers.get(i);

			numbersSq.add(result);

		}
		System.out.println(numbersSq);
	}

	static void UniqueValues() {
		System.out.println("Unique Values: ");
		//List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(collector.toList());
	}

}
