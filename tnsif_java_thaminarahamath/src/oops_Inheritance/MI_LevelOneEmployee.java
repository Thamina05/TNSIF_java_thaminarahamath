package oops_Inheritance;
import java.util.Date;
public class MI_LevelOneEmployee extends MI_Employee {
		    private int noOfShares;
		    private String authority;
		    
		    public MI_LevelOneEmployee() {}
		    
		    public MI_LevelOneEmployee(String name, long contactNo, Date dateOfBirth,String deptName, double baseSalary, int noOfShares, String authority) {
		    	super(name,contactNo,dateOfBirth,deptName, baseSalary);
		        this.noOfShares = noOfShares;
		        this.authority=authority;
		    }

			public int getNoOfShares() {
				return noOfShares;
			}

			public void setNoOfShares(int noOfShares) {
				this.noOfShares = noOfShares;
			}

			public String getAuthority() {
				return authority;
			}

			public void setAuthority(String authority) {
				this.authority = authority;
			}

			@Override
			public String toString() {
				return "MI_LevelOneEmployee ["+super.toString()+"noOfShares=" + noOfShares + ", authority=" + authority + "]";
			}   
		


	}


