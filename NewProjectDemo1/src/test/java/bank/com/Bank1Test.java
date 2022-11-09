/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package bank.com;

import com.mycompany.calculations.newprojectdemo1.Bank1;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author User
 */
public class Bank1Test {
    Bank1 ba;
    
    public Bank1Test() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        ba = new Bank1();
        
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }      
         @Test
      public  void testName(){
        ba.setName("Chase");
        ba.setCode(001);
        assertEquals("Chase",ba.getName());
             assertEquals(001, ba.getCode());
    
    
    
        
        
    }

}