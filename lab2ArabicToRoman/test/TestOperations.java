
import lab2ArabicToRoman.Operations.Operations;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Class that tests public methods from a file Operations.java
 * @author Mariusz Drynda 
 * @version 1.0
 */
public class TestOperations {
Operations operations = new Operations();
    @Test
    public void testArabicToRoman1()
    {   
        String x="123";
        assertEquals("CXXIII",operations.arabicToRoman(x));
    }
     @Test
public void testArabicToRoman2(){   
        String x="roman";
        assertEquals("ERROR!",operations.arabicToRoman(x));
    }
 @Test
public void testArabicToRoman3(){   
        String x="99abc";
        assertEquals("ERROR!",operations.arabicToRoman(x));
        
    }
 @Test
public void testArabicToRoman4(){   
        String x="-99";
        assertEquals("Bad number!",operations.arabicToRoman(x));
    }
 @Test
public void testArabicToRoman5(){   
        String x="0";
        assertEquals("Bad number!",operations.arabicToRoman(x));
    }
 @Test
public void testArabicToRoman6(){   
        String x="5555";
        assertEquals("Bad number!",operations.arabicToRoman(x));
    }

}
