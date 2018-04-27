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
// Keypad.java
// Represents the keypad of the ATM
import java.util.Scanner; // program uses Scanner to obtain user input

public class Keypad
{
    private Scanner input; // reads data from the command line

    // no-argument constructor initializes the Scanner
    public Keypad()
    {
        input = new Scanner( System.in );
    } // end no-argument Keypad constructor

    // return an integer value entered by user
    public int getInput()
    {
        return input.nextInt(); // we assume that user enters an integer
    } // end method getInput
} // end class Keypad