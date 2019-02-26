
public class LambdaString {

	static String one = "Equals";
	static String two = "Equals";

	static CheckString checker = (one, two) -> one.equals(two);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checker.Check(one, two));
	}

	interface CheckString {
		boolean Check(String one, String two);
	}

}
