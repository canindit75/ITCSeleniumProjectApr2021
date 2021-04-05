package JavaOOPSPack;
//Demo for Objects of Employee2 Class
public class EmployeeTest2 {
	  public static void main(String[] args){
		  System.out.println(Employee2.company); //Amazon
		  //create an instance or object of Employee2 class
		  Employee2 emp1 = new Employee2();
		  emp1.insertEmpRecord(100, "Rakesh","ITC");
		  emp1.displayEmpRecord();
		  System.out.println ("company = "+Employee2.company);
		  String c = Employee2.ChangeCompany("MPhasis");
		  System.out.println ("company = "+c);
		  
		  Employee2 emp2 = new Employee2();
		  emp2.empid = 101;
		  emp2.empname = "Punitha";
		  emp2.company = "Samsung";
		  //emp1.displayEmpRecord(); 
		  emp2.displayEmpRecord();
		  System.out.println ("company = "+Employee2.company);
		  
		  
		  Employee2 emp3 = new Employee2();

		  emp3.insertEmpRecord(102, "Lakshmi","Reliance");
		  //emp1.displayEmpRecord(); 
		  //emp2.displayEmpRecord();
		  emp3.displayEmpRecord();
		  System.out.println ("company = "+Employee2.company);
		  Employee2 emp4 = new Employee2();
		  //when object is not initialized - it shows default values
		  //for int it is 0 and for string it is nulls
		  //emp1.displayEmpRecord(); 
		  //emp2.displayEmpRecord();
		  //emp3.displayEmpRecord();
		  emp4.displayEmpRecord();
		  System.out.println ("company = "+Employee2.company);
		  Employee2 emp5 = new Employee2(103,"Nitmani","ITC");
		  //emp1.displayEmpRecord(); 
		  //emp2.displayEmpRecord();
		  //emp3.displayEmpRecord();
		  //emp4.displayEmpRecord();
		  emp5.displayEmpRecord();
		  System.out.println ("company = "+Employee2.company);
		  
		  Employee2 emp6 = new Employee2(104,"Anindita");
		  //emp6.displayEmpRecord();
		  System.out.println ("company = "+Employee2.company);
	  }
}
