
public class LambdaCalculator {
	
	MathOperations addition = (a,b) -> a + b;
	MathOperations subtraction = (a,b) -> a - b;
	MathOperations multiplication = (a,b) -> a * b;
	
	public  int operate(int a, int b, MathOperations mathOperation) {
		return mathOperation.operation(a,b);
	}

	

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(operate(2,3,addition));

	}

	
	interface MathOperations{
		int operation(int a, int b);
	}
	
}
