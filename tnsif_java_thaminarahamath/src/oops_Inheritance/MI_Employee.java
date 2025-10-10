package oops_Inheritance;
import java.util.Date;
		public class MI_Employee extends MI_Person {
			private String deptName;
			private double baseSalary;
			
			public MI_Employee() {}

			public MI_Employee(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary) {
				super(name, contactNo, dateOfBirth);
				this.deptName = deptName;
				this.baseSalary = baseSalary;
			}

			public String getDeptName() {
				return deptName;
			}

			public void setDeptName(String deptName) {
				this.deptName = deptName;
			}

			public double getBaseSalary() {
				return baseSalary;
			}

			public void setBaseSalary(double baseSalary) {
				this.baseSalary = baseSalary;
			}

			@Override
			public String toString() {
				return "MI_Employee ["+super.toString()+", deptName=" + deptName + ", baseSalary=" + baseSalary + "]";
			}

			
		}



