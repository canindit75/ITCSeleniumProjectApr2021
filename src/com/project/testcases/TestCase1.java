package com.project.testcases;

import com.project.testdata.TestData1;
import com.project.testdata.TestData2;

//import com.project.testdata.TestData1;
//import com.project.testdata.*;

//import com.project.testdata.TestData1;
public class TestCase1 {
	
	public static void main(String[] args){
		//to access this class of another package, we need to import the class
		//importing the class requires to specify complete package with class name preceded with import
		//Short Cut is Ctrl+Shift + O for importing all packages
		TestData1 td = new TestData1();
		TestData2 td2 = new TestData2();
		//com.project.testdata.TestData1 td11 = new com.project.testdata.TestData1();
		//com.project.testdata.TestData2 td22 = new com.project.testdata.TestData2();

	}

}
