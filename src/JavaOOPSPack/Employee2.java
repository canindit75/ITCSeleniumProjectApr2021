<<<<<<< HEAD
package JavaOOPSPack;
//Demo for Class
public class Employee2{
  //3 data members
  int empid;
  String empname;
  static String company;
  //2 behaviors - insert or creating an emp record
  //display emp record
  static int count=0;
  static{
	  company = "Amazon";
  }
  public Employee2(){
	  System.out.println("Default Constructor of Employee");
	  count = count + 1;
	}

  public Employee2(int empid, String empname){
	  this.empid = empid;
	   this.empname = empname;
	   count = count + 1;
  }
  
  public Employee2(int empid, String empname,String company){
	   System.out.println("Employee Parameterized Constructor");
	   this.empid = empid;
	   this.empname = empname; 
	   this.company = company;
	   count = count + 1;
	}
  public void insertEmpRecord(int eid,String ename,String comp){
     empid = eid;
     empname = ename;
     company = comp;
  }

  public void displayEmpRecord()
  {
    System.out.println("count = " + count + " empid = " + empid + " empname = " + empname + " comp = " + company);
  }

  public static String ChangeCompany(String comp){
	  return comp;
  }
=======
package JavaOOPSPack;
//Demo for Class
public class Employee2{
  //3 data members
  int empid;
  String empname;
  static String company;
  //2 behaviors - insert or creating an emp record
  //display emp record

  public Employee2(){
	  System.out.println("Default Constructor of Employee");
	}

  public Employee2(int empid, String empname){
	  this.empid = empid;
	   this.empname = empname; 	  
  }
  
  public Employee2(int empid, String empname,String company){
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

>>>>>>> 5b2d57475ef791d733f5760c3e1b6679098a3d32
}