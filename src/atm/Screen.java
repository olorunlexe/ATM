/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author JOHN
 */
// Screen.java
// Represents the screen of the ATM
//import javax.swing.*;
//import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
public class Screen
{
    // display a message without a carriage return
    public void displayMessage( String message )
    {
        //JOptionPane.showMessageDialog(null, message, "FIRST BANK ATM", INFORMATION_MESSAGE);
        System.out.print( message );
    } // end method displayMessage

    // display a message with a carriage return
    public void displayMessageLine( String message )
    {
        //JOptionPane.showMessageDialog(null, message, "FIRST BANK ATM", INFORMATION_MESSAGE);
        System.out.println( message );
    } // end method displayMessageLine

    // displays a dollar amount
    public void displayDollarAmount( double amount )
    {
        //JOptionPane.showMessageDialog(null, "$%,.2f" + amount, "FIRST BANK ATM", INFORMATION_MESSAGE);
        System.out.printf( "$%,.2f", amount );
    } // end method displayDollarAmount
} // end class Screen