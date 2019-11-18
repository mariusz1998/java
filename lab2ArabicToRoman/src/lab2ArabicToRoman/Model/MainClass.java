package lab2ArabicToRoman.Model;
import lab2ArabicToRoman.View.MainPanel;
import lab2ArabicToRoman.Operations.Operations;
import javax.swing.JFrame;
 /**
     * Class stores and call a window 
     * @author Mariusz Drynda
     * @version 1.2
     */
public class MainClass {
     /**
      * Application window 
      */
     private final JFrame mainwindow; 
     /**
      * Window setting 
      */
    public MainClass() { 
        mainwindow = new JFrame(); 
        mainwindow.setBounds(200,200,540,500);
        mainwindow.setTitle("Arabic number to roman number");
        mainwindow.setLayout(null);
        mainwindow.setContentPane(new MainPanel());
        mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainwindow.setVisible(true);
        }
    /**
     * call exception
     * @throws IllegalAccessException 
     */
     public void callException() throws IllegalAccessException
     {
         throw new NullPointerException();
     }
    /**
     * Window call and catch exception
     */
    public static void main(String[] args) { 
     MainClass arabicObiect = new MainClass(); 
     try {
     arabicObiect.callException();
    } catch (IllegalAccessException e) {
        Operations.exceptionHandling();
    }
    }
}

