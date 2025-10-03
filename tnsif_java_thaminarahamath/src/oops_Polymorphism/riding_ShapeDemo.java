package oops_Polymorphism;

public class riding_ShapeDemo {

	public static void main(String[] args) {
		riding_Shape[] shapes = new riding_Shape[3];

		// Instantiate objects of Circle, Triangle, and Square
		shapes[0] = new riding_Circle(5.0);
		shapes[1] = new riding_Triangle(4.0, 3.0);
		shapes[2] = new riding_Square(6.0);

		for (riding_Shape shape : shapes) {
			shape.draw();
			shape.erase();
			System.out.println("----------------------"); 
		}
	}

	}
