package JavaOOPSPack;
//Demo for Class
public class Employee{
  //3 data members
  int empid;
  String empname;
  String company;
  //2 behaviors - insert or creating an emp record
  //display emp record

  public Employee(){
	  System.out.println("Default Constructor of Employee");
	}

  public Employee(int empid, String empname){
	  this.empid = empid;
	   this.empname = empname; 	  
  }
  
  public Employee(int empid, String empname,String company){
	   System.out.println("Employee Parameterized Constructor");
	   this.empid = empid;
	   this.empname = empname; 
	   this.company = company;
	}
  public void insertEmpRecord(int eid,String ename,String comp){
     empid = eid;
     empname = ename;
     company = comp;
  }

  public void displayEmpRecord()
  {
    System.out.println("empid = " + empid + " empname = " + empname + " comp = " + company);
  }

}