package Hw1_5.Control;

import Hw1_5.Boundary.Keyboard;
import Hw1_5.Boundary.Screen;
import Hw1_5.Entity.Account;

public class SavingControl {
    public void execute(Account acc, Screen scr, Keyboard kbd) {
        scr.displayPrompt("저장할 금액을 입력하시오: ");
        int amount = kbd.getAmount();
        acc.setBalance(amount);
        scr.displayMessage("잔고가 " + acc.getBalance() + " 입니다.");
    }
}
