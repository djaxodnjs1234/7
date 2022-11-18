package Hw1_5.Entity;

public class Account {
    private static int lastAccountNumber=0;
    private int accountNumber;
    private int balance;
    private String owner;

    public Account(String name, int amount) {
        this(amount);
        owner = name;
    }
    public Account(int amount) { accountNumber = nextAccNum(); balance = amount; }

    // Object’s Interface
    public int getAccNum() { return accountNumber; }
    public int getBalance() { return balance; }
    public void setBalance(int amount){balance = amount; }
    private static int nextAccountNumber() {
        return ++lastAccountNumber;
    }
    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(long amount) {
        if (amount <= balance) {
            balance-=amount;
            return true;
        } else {
            return false;
        }

    }
    protected void minusBalance(int amount)    { balance -= amount; }
    protected void plusBalance(int amount) { balance += amount; }
    protected static int nextAccNum()     { return ++lastAccountNumber; }

    public void showAccount() { // For test
        System.out.printf("%04d-%04d %10d%n", accountNumber/1000, accountNumber%10000, balance);
    }
}