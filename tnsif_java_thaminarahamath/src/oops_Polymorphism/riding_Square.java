package oops_Polymorphism;
		public class riding_Square extends riding_Shape {
			private double side;

			// Constructor for Square
			public riding_Square(double side) {
				this.side = side;
			}

			// Override draw method for Square
			@Override
			public void draw() {
				System.out.println("Drawing a square with side " + side);
			}

			// Override erase method for Square
			@Override
			public void erase() {
				System.out.println("Erasing a square with side " + side);
			}

	}

