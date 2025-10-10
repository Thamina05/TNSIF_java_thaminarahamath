package MultiThreading_java;

public class Thread_methods {

	public static void main(String[] args) {
				Child_thread threadOne = new Child_thread(); // creating child thread object
				Child_thread threadTwo = new Child_thread(); // creating child thread object
				System.out.println("Current Thread: " + Thread.currentThread());// returns current thread

				threadOne.start();
				threadTwo.start();
				Thread.currentThread().setName("Parent Thread"); // assign name to thread
				Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // changing priority of the thread
				System.out.println("Current Thread: " + Thread.currentThread());// returns current thread
				try {
					threadOne.join(); // wait current thread until t1 is dead
					threadTwo.join(300); // wait current thread until t2 is dead or time period is over
				} catch (InterruptedException e) {
					System.err.println("Thread interrupted: " + e.getMessage());
				}
				System.out.println("-----------------------End of Main--------------------------");
			}
		


	}


