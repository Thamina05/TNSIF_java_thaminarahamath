package Interface_java;
interface Shape{
		
			void draw();
}

public class Interface_Demo implements Shape{
			
			//implementation or explanation
public void draw() {
	     System.out.println("Drawing a circle in an interface");
}

public static void main(String[] args) {
				
     Interface_java.Interface_Demo id = new Interface_Demo();
	 id.draw();
				

				
			}

		

	}


