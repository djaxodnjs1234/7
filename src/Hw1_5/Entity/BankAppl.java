/*
6
 */
package Hw1_5.Entity;

import Hw1_5.Boundary.*;
import Hw1_5.Control.*;

public class BankAppl {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.run();
    }
}

class Bank {
    private Screen scr;
    private Keyboard kbd;
    private Account acc1, acc2;


    public Bank() {

        scr = new Screen();
        kbd = new Keyboard();

        acc1 = new NormalAccount("홍길동", 10000);
        acc2 = new MinusAccount("홍판서", 50000);
    }

    public void run() {
        while (true) {

            char command = getCommand();
            if (command == '6')
                break;

            switch (command) {
                case '1':
                    new InquiryControl().execute(acc1, scr);
                    break;
                case '2':
                    new DepositControl().execute(acc1, scr, kbd);
                    break;
                case '3':
                    new WithdrawControl().execute(acc1, scr, kbd);
                    break;
                //	case '4' : new TransferControl().execute(acc1, acc2, scr, kbd); break;
                //	case '5' : new OpenControl().execute(scr, kbd); 			break;
                case '4':
                    new SavingControl().execute(acc1, scr, kbd);
                default:
                    break;
            }
            System.out.println("Terminated...");
        }

    }
    private char getCommand() { // helper method
        // display menu
        System.out.println("\n\n\t\tM e n u");
        System.out.println("\t\t\t (1) Balance Inquiry");
        System.out.println("\t\t\t (2) Deposit");
        System.out.println("\t\t\t (3) Withdraw");
        System.out.println("\t\t\t (4) Saving");
        System.out.println("\t\t\t (5) Terminate");

        // get user selection
        scr.displayPrompt("\n\t\t번호를 입력하시오: ");
        return kbd.getSelection();
    }
}
