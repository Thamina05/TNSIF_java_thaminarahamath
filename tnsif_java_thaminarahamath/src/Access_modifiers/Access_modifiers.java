package Access_modifiers;

public class Access_modifiers {
		public int publicVar = 10;
		private int privateVar = 20;
		protected int protectedVar = 30;
		int defaultVar = 40;
		
		
		public void show() {
			System.out.println("Public Variable: "+ publicVar);
			System.out.println("Private Variable: "+ privateVar);
			System.out.println("Protected Variable: "+ protectedVar);
			System.out.println("Default Variable: "+ defaultVar);
		}

		public static void main(String[] args) {
			
			Access_modifiers ame = new Access_modifiers();
			ame.show();
			

		}


	}


