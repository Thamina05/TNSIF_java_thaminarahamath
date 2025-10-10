package MultiThreading_java;

public class Thread_Demo {

	public static void main(String[] args) {
				Child_thread threadOne = new Child_thread();
				Child_thread threadTwo = new Child_thread();

				threadOne.start();
				//threadOne.start(); // throws IllegalStateException
				// threadOne.run(); // single threaded application 
				threadTwo.start();

				System.out.println("-----------------------End of Main--------------------------");
			}
		


	}


