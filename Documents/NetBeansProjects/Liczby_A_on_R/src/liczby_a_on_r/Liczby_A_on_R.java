/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liczby_a_on_r;

import javax.swing.JFrame;

/**
 *
 * @author Student
 */
public class Liczby_A_on_R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      JFrame mainwindow = new JFrame(); 
        mainwindow.setBounds(0,0,640,400);
            mainwindow.setLayout(null);
        mainwindow.setContentPane(new MainPanel());
   
        mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainwindow.setVisible(true); 
    }
    
}
