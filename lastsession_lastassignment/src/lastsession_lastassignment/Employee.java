package lastsession_lastassignment;

import java.util.*;






public class Employee {
    //declaring three variables of the class
	private String name,designation;
	private int salary;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//Constructor of Employee class
	Employee(String name,String designation,int salary){
		this.name = name;
		this.designation=designation;
		this.salary = salary;
	}
		public String toString(){
			return "Name: "+this.name+"-- Salary: "+this.salary+"   Designation :"+this.designation;
		}
		 public static void main(String a[]){
		      
		        System.out.println("===========================");
		        //By using salary comparator (int comparison)
		        TreeSet<Employee> salComp = new TreeSet<Employee>(new MySalaryComp());
		        salComp.add(new Employee("Ram","Android Developer",33000));
		        salComp.add(new Employee("John","Senior java Developer",33000));
		        salComp.add(new Employee("Tapan","Manager Developer",54000));
		        salComp.add(new Employee("Siri","Java Developer",22400));
		        for(Employee e:salComp){
		            System.out.println(e);
		        }
		        
		        System.out.println("===========================");
		      
		    }
}
//MyNameComp is created to compare the name property
class MyNameComp implements Comparator<Employee>{
	 
    @Override
    public int compare(=Employee e1, Employee e2) {
    	if(e1.getName().equals(e2.getName()))
    			{ 
    		
    				return e1.getDesignation().compareTo(e2.getDesignation()); 
    				}  
    		  
    		else  
    			return e1.getName().compareTo(e2.getName());
    }
}  

//this is created to compare the designation of the employee
class MyDesignationComp implements Comparator<Employee>{
	 
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getDesignation().compareTo(e2.getDesignation());
    }
} 
 
class MySalaryComp implements Comparator<Employee>{
 
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else if (e1.getSalary() == e2.getSalary()){
            return e1.getName().compareTo(e2.getName());
        }
        else return -1;
    }
}

class Checker implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
    	Employee a = (Employee)o1;
    	Employee b = (Employee)o2;
        if (a.getSalary() == b.getSalary()) {
            return a.getName().compareTo(b.getName());
        } 
        else if(a.getName().equals(b.getName()))
    			{ 
    		
    			return a.getDesignation().compareTo(b.getDesignation()); 
    			}  
	        else{
	        		return b.getSalary() - a.getSalary();
	        }
    }
}



