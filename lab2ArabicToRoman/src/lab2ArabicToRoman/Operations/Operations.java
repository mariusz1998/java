package lab2ArabicToRoman.Operations;

import lab2ArabicToRoman.ListOperations.ListOperations;
/**
 * Class make change Arabic number to Roman number
 * @author Mariusz Drynda
 * @version 1.2
 */
public class Operations {
    /**
     * Tables that store roman characters 
     */
private static final int arabic[] = {1000, 500, 100, 50, 10, 5, 1};
/**
 * Tables that store corresponding roman numbers in the arabic system
 */
private static final char roman[] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
@FunctionalInterface 
/**
 * declaration of the interface associated with the lambda expression
 * operation decreases number of Arabic during main operation
 *@return number of Arabic
 */
interface InterfaceDecrease{
int decreaseNumber(int number,int a,int b);}
static InterfaceDecrease decrease = (number,a,b)->{
       number -= arabic[b] - arabic[a];
        return number;
        };
/**
 * @param a is the Roman table array index
 * @param b is the Roman table array index
 * @param result a result that is further modified
 * @return a result 
 */
private static String changeResult (int a, int b , String result)
{
 result += roman[a];
result += roman[b];
return result; 
}
@SuppressWarnings("unchecked")
/**
*Function that performs the exchange
* @param romanNumber string variable taken from the user from the application
*  @return function return roman number but statement 
*/
public static String arabicToRoman(String romanNumber) { 
    ListOperations listObject = new ListOperations();
    listObject.listOfArabicNumbers.add(romanNumber);  //add to of numbers to display history 
int i = 0, romanNumberInt; //variable that stores, the changed String on integer
String result = ""; //variable that stores the changed String on integer
try {
romanNumberInt = Integer.parseInt(romanNumber);	
if ((romanNumberInt > 4999) || (romanNumberInt <= 0)) {//the calculator changes numbers between <1.4999>
listObject.listOfRomanNumbers.add("Bad number!"); //add to  display history
return "Bad number!";
}
while (romanNumberInt > 0) { 
if(romanNumberInt >= arabic[i]) {
romanNumberInt -= arabic[i];
result += roman[i];
} //the result is obtained by changing 
//the digit furthest from the unity digit
else if ((i%2 == 0) && // check 9xx condition
(romanNumberInt >= arabic[i] - arabic[i+2]) &&
(arabic[i+2] != arabic[i] - arabic[i+2])) { 
//you don't always have to check receipt of "9"
romanNumberInt = decrease.decreaseNumber(romanNumberInt,i+2,i);
result =changeResult(i+2,i,result);
i++;
}
// w sumie jak dasz to w te else funkcje mozna w jedna funkcje
// to bedziesz mial wiecej do testowania 
else if ((i%2 == 1) && //check 4xx condition 
(romanNumberInt >= arabic[i] - arabic[i+1]) &&
(arabic[i+1] != arabic[i] - arabic[i+1])) {
//you don't always have to check receipt of "4"
romanNumberInt = decrease.decreaseNumber(romanNumberInt,i+1,i);
result =changeResult(i+1,i,result); 
i++;
}
else {
i++;
}
}
listObject.listOfRomanNumbers.add(result); 
return result;
}
catch(NumberFormatException nfe ) {
//exception for bad string to integer conversion
    listObject.listOfRomanNumbers.add("ERROR!"); 
return "ERROR!" ;
}
} 
/**
 * method which handles the exception
 */
   public static void exceptionHandling() {
            ListOperations.listOfRomanNumbers.add("Error!"); 
            //do poprawy 
        }
}