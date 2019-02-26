import java.util.Scanner;

public abstract class Animal {
	
	public  int legs;
	public String bloodType;
	public String foodType;
	
	legAmount check = (a) -> a = 4;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int numberOfLegs() {

			return legs;
	}
	
	interface legAmount{
		int legCheck(int a);
	}
	
	
	public abstract void makeNoise();

}
