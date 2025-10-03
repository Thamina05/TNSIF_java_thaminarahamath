package oops_Inheritance;

public class Hierarchical_InhDemo {

	public static void main(String[] args) {
		HI_Person p1 = new HI_Person();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		HI_Person p;
		p = new HI_Person("Dhruv", "Mumbai");
		if (p instanceof HI_Person)
			System.out.println("Person Details "+p);
		
		p = new HI_Employee("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (p instanceof HI_Employee)
		System.out.println("Employee Details "+p);
		p = new HI_Student("Pankaj", "Pune", "FE", 88);
		if (p instanceof HI_Student)
			System.out.println("Student Details "+p);

	}

		

	}


