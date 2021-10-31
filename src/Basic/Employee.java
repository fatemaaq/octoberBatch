package Basic;

import java.util.ArrayList;
import java.util.*;
public class Employee implements Comparable<Employee>{  //Comparable interface only have one method 
	 												    //compare to which you have to include here on line 

	int empID;
	int empAge;
	String empName;
	
	Employee (int id, int age, String name) {
		
		this.empID = id;
		this.empAge = age;
		this.empName = name;
	}
	
	public static void main(String[] args) {
		
			Employee e = new Employee(40,41,"Fatema");
			Employee e1= new Employee(35,42,"AbdulQadir");
			Employee e2= new Employee(20,43,"Insiyah");
			
			ArrayList<Employee> al = new ArrayList<Employee>();
			al.add(e1);
			al.add(e);
			al.add(e2);
			
			for(Employee x: al) {
				System.out.println("Age of Employee is: "+ x.empAge  + " Name of Employee: "+x.empName  + " Employee ID: "+ x.empID);
			}
			
			Collections.sort(al);
			System.out.println();

			for(Employee x: al) {
				System.out.println("Age of Employee is: "+ x.empAge  + " Name of Employee: "+x.empName  + " Employee ID: "+ x.empID);
			}

	}

	@Override
	public int compareTo(Employee o) {
		if(this.empID == o.empID) {
			return 0;
	}
		else if(this.empID > o.empID) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}