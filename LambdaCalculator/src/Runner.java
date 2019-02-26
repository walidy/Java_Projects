
public class Runner {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LambdaCalculator calc = new LambdaCalculator();
		
		System.out.println("20 + 10 = " + calc.operate(20, 10, calc.addition));
		System.out.println("20 - 10 = " + calc.operate(20, 10, calc.subtraction));
		System.out.println("20 * 10 = " + calc.operate(20, 10, calc.multiplication));
		
	}

}
