package Hw1_5;

import Hw1_5.Control.*;
import Hw1_5.Boundary.*;
import Hw1_5.Entity.*;

public class Hw1_5 {
    public static void main(String[] args) {



    } // end of class Bank

    public static char getCommand() { // helper method

        Screen scr = new Screen();
        Keyboard kbd = new Keyboard();
        // display menu
        System.out.println("\n\n\t\tM e n u");
        System.out.println("\t\t\t (1) Balance Inquiry");
        System.out.println("\t\t\t (2) Deposit");
        System.out.println("\t\t\t (3) Withdraw");
        System.out.println("\t\t\t (4) Account Transfer");
        System.out.println("\t\t\t (5) Account Opening");
        System.out.println("\t\t\t (6) Terminate");

        // get user selection
        scr.displayPrompt("\n\t\t번호를 입력하시오: ");
        return kbd.getSelection();
    }
}