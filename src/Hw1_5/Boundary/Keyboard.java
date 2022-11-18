package Hw1_5.Boundary;

import java.util.Scanner;

public class Keyboard {
    private Scanner kbd = new Scanner(System.in);

    public char getSelection() { return kbd.next().charAt(0); }

    public int getAmount() {
        return kbd.nextInt();
    }

    public String getName() {
        return kbd.next();
    }
}