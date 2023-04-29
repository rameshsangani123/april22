
package text.com;

import com.itexps.utility.apri29ngcalc.Calculator;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CalculatorTest {
    Calculator cal;
    public CalculatorTest() {
    }

    

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        cal = new Calculator ();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testAdd() {
        assertEquals(cal.add(2,4), 6);
    }
    
}
