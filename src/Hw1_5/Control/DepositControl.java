package Hw1_5.Control;

import Hw1_5.Boundary.*;
import Hw1_5.Entity.Account;

public class DepositControl {
    public void execute(Account acc, Screen scr, Keyboard kbd) {
        scr.displayPrompt("입금할 금액을 입력하시오: ");
        int amount = kbd.getAmount();
        acc.deposit(amount);
        scr.displayMessage("잔고가 " + acc.getBalance() + " 입니다.");
    }
}