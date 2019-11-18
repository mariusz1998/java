import lab2ArabicToRoman.ListOperations.ListOperations;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Class that tests public methods from a file ListOperations
 * @author Mariusz Drynda
 * @version 1.0
 */
public class TestListOperations {
    ListOperations testlist = new ListOperations();
    @Test
public void testShowListRoman(){   
        assertNotNull(testlist.showListRoman());
    }
    @Test
public void testShowListArabic(){   
        assertNotNull(testlist.showListArabic());
    }
}