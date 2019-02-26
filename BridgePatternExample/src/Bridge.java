
public class Bridge {

	public static void main(String[] args) {
		Shape redCircle = new Circle(new RedCircle(),100, 10, 100);
	      Shape greenCircle = new Circle(new GreenCircle(),100, 10, 100);

	      redCircle.draw();
	      greenCircle.draw();
	}

}
