package JavaOOPSPack;
public class Employee{
  //3 data members
  int empid;
  String empname;
  String company;
  //2 behaviors - insert or creating an emp record
  //display emp record

  public void insertEmpRecord(int eid,String ename,String comp){
     empid = eid;
     empname = ename;
     company = comp;
  }

  public void displayEmpRecord()
  {
    System.out.println("empid = " + empid + " empname = " + empname + " comp = " + company);
  }
  public static void main(String[] args){
	  //create an instance or object of Employee class
	  Employee emp1 = new Employee();
	  emp1.insertEmpRecord(100, "Rakesh","ITC");
	  emp1.displayEmpRecord();
	  
	  Employee emp2 = new Employee();
	  emp2.empid = 101;
	  emp2.empname = "Punitha";
	  emp2.company = "Samsung";
	  emp2.displayEmpRecord();
	  
	  Employee emp3 = new Employee();
	  emp3.insertEmpRecord(102, "Lakshmi","Reliance");
	  emp3.displayEmpRecord();
	  
	  Employee emp4 = new Employee();
	  //when object is not initialized - it shows default values
	  //for int it is 0 and for string it is nulls
	  emp4.displayEmpRecord();
  }
}