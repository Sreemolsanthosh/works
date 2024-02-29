package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {


     @BeforeTest                                                          
     public void setUp()
     {
    	 System.out.println("browser open");
     }
     
     @BeforeMethod
     public void urlloading()
     {
    	 System.out.println("url details");
     }
     
     @Test(priority = 3,invocationCount=3)
     public void test1()
     {
    	 System.out.println("test 1");

     }
     @Test(priority = 1,enabled=false )
     public void test2()
     {
    	 System.out.println("test 2");

     }
     @Test(priority = 2,dependsOnMethods = "test2")
     public void test3()
     {
    	 System.out.println("test 3");

     }
     
     @AfterMethod
     public void aftermthd()
     {
    	 System.out.println("after method details");

     }
     @AfterTest
     public void tearDown()
     {
    	 System.out.println("browser quit");

     }
}

/* while giving priority,we can arrange the order of execution. while giving priority it must be given to all test otherwise test withot priority
 * runs first coz it indicates as priority=0.
 * to execute many times we use invocationCount i.e invocationCount=3 (for 3 tyms execution)
 * to stop executing any test we use enable true/false i.e :
   to stop execute a particular test , enable=false
   to execute it make enable=true or delete tat false stmnt
 * to run any test depending on other test we use ,dependsOnMethods = "test number"
 * 
 * if we didint give any priority then the execution is :
 * 1st----@beforetest
 * 2nd----@beforemethod
 * 3rd----@test1
 * 4th----@aftermethod
 * 5th----@beforemethod
 * 6th----@test2
 * 7th----@aftermethod
 * 8th----@beforemethod
 * 9th----@test3
 * 10th---@aftermethod
 * 11th---@aftertest
 */






















