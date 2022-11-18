package Hw1_5.Control;

import Hw1_5.Boundary.Keyboard;
import Hw1_5.Boundary.Screen;
import Hw1_5.Entity.Account;

public class WithdrawControl {
    public void execute(Account acc, Screen scr, Keyboard kbd) {
        scr.displayPrompt("출금할 금액을 입력하시오: ");
        int amount = kbd.getAmount();
        if (acc.withdraw(amount))
            scr.displayMessage("잔고가 " + acc.getBalance() + " 입니다.");
        else
            scr.displayMessage("잔고가 부족합니다.");
    }
}