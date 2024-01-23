package abstarction;

public class Abstraction_main {

	public static void main(String[] args) {
		Circle circle=new Circle();
		Rectangle rectangle=new Rectangle();
		
		circle.draw();
		rectangle.draw();
		circle.displayInfo();
		rectangle.displayInfo();

	}

}
