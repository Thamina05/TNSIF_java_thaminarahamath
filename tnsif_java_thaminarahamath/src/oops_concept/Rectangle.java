package oops_concept;
public class Rectangle extends Shape_java {
		private float width, height;
		public Rectangle() {
			this.width = 5.0f;
			this.height = 2.0f;
		}

		public Rectangle(float width, float height) {
			this.width = width;
			this.height = height;
		}

		@Override
		void calArea() {
			area=width*height;
		}
		public void show() {
		
			
		}
	}



