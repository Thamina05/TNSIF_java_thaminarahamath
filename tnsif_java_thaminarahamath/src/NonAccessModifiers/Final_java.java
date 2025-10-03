package NonAccessModifiers;
		class Final_java {
			
			protected static final String Max = null;
			int Var = 100;
			
			void display() {
				System.out.println("show the value of max: "+Max);
			}

			public static void main(String[] args) {
				Final_java fd = new Final_java();
				fd.display();
				fd.Var = 100;

			}

		}

		class Child extends Final_java{
			private static final String Max = null;
			

			void display() {
				System.out.println("show the value of max: "+Max);
			}
		

	}

