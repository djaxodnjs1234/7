package Hw1_5.Control;
import Hw1_5.Boundary.Screen;
import Hw1_5.Entity.Account;

public class InquiryControl {
    public void execute(Account acc, Screen scr) {
        scr.displayMessage("잔고가 " + acc.getBalance() + " 입니다.");
    }
}