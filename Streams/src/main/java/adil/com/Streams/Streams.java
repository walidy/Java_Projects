package adil.com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	static List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even Numbers: ");
		numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

		System.out.println("Multiple Ten Numbers: ");
		numbers.stream().map(i -> i * 10).forEach(System.out::println);

		System.out.println("Max Number: ");
		System.out.println(numbers.stream().reduce(Math::max));

		System.out.println("Min Number: ");
		System.out.println(numbers.stream().reduce(Math::min));

		System.out.println("Square Numbers: ");
		List<Integer> squareList = numbers.stream().map(i -> i * i).collect(Collectors.toList());

		System.out.println(squareList);

		System.out.println("Distinct Numbers: ");
		numbers.stream().distinct().forEach(System.out::println);

	}

}
