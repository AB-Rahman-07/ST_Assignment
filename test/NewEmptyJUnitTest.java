/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication1.JavaApplication1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mohammad.abdurrehman
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @Test
    public void Test5000() {
           JavaApplication1 p = new JavaApplication1();
           assertEquals(true,p.func(5000));
    }
    
    @Test
    public void Testmin1() {
       JavaApplication1 p = new JavaApplication1();
           assertTrue(p.func(-1));
    }
    
    @Test
    public void Test100() {
            JavaApplication1 p = new JavaApplication1();
           assertFalse(p.func(100));
    }
    
    @Test
    public void test1700() {
        JavaApplication1 p = new JavaApplication1();
           assertNotNull(p.func(1700));
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
