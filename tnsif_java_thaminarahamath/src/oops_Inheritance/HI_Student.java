package oops_Inheritance;
		public class HI_Student extends HI_Person
		{
			private String clas;
			private float per;
			public HI_Student() {
				System.out.println("Student class default constructor");
				clas="FY";
				per=70;
			}
			public HI_Student(String clas, float per) {
				this.clas = clas;
				this.per = per;
			}
			
			public String getClas() {
				return clas;
			}
			public void setClas(String clas) {
				this.clas = clas;
			}
			public float getPer() {
				return per;
			}
			public void setPer(float per) {
				this.per = per;
			}
			public HI_Student(String name, String city,String clas, float per )
			{
				//private members can't inherited into child class
				/*
				 * super.name=name; super.city=city;
				 */
				super(name,city);
				this.clas = clas;
				this.per = per;
			}
			@Override
			public String toString() {
				return "HI_Student [clas=" + clas + ", per=" + per + ", getName()=" + getName() + ", getCity()=" + getCity() + "]";
			}
	}

