
public class HelloWorldLambdas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloWorld HelloWorld1 = s -> System.out.println(s);
		HelloWorld1.sayString("hello world");

	}

	interface HelloWorld {
		void sayString(String s);
	}

}
