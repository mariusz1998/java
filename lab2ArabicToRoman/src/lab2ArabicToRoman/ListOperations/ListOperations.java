package lab2ArabicToRoman.ListOperations;
import java.util.ArrayList;
import java.util.List;
/**
 * Class that stores a collection of numbers
 * @author Mariusz Drynda 
 * @version 1.1
 */
public class ListOperations {
   
    public static List<String> listOfRomanNumbers = new ArrayList<>();
public static List<String> listOfArabicNumbers = new ArrayList<>();
@SuppressWarnings("unchecked")
/**
 * A method showing the history of Roman numbers
 */
public static String showListRoman() {
    String historyRoman="";
    for(String s:listOfRomanNumbers) //using for each 
        historyRoman+=s+"\n";
    return historyRoman;
}
/**
 * A method showing the history of Arabic numbers
 */
@SuppressWarnings("unchecked")
public static String showListArabic() {
    String historyArabic="";
    for(String s:listOfArabicNumbers) //using for each 
        historyArabic+=s+"\n";
    return historyArabic;
}
}
