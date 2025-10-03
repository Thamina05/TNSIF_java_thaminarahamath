package oops_Inheritance;
import java.util.Date;

public class MI_Inheritance_Demo {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
				
				MI_Person p1 = new MI_Person("Atharv", 7878767676l, new Date(2000, 12, 2));
				System.out.println(p1);

				p1 = new MI_Employee("Pranav", 8080807070l, new Date(1995, 05, 07), "Sales", 45000);
				System.out.println(p1);

				p1 = new MI_LevelOneEmployee("Madhur", 9880807227l, new Date(1988, 15, 02), "Account", 85000, 200,
						"Signing Authority");
				System.out.println(p1);
			}
}
