package oops_Polymorphism;

class riding_Circle extends riding_Shape  {
		private double radius;
		public riding_Circle(double radius) {
			this.radius = radius;
		}

		public void draw() {
			System.out.println("Drawing a circle with radius " + radius);
		}

		// Override erase method for Circle
		public void erase() {
			System.out.println("Erasing a circle with radius " + radius);
		
	}

}
