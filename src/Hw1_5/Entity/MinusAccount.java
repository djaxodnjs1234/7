package Hw1_5.Entity;

class MinusAccount extends Account {
    private int creditLimitAmount; // 추가
    public MinusAccount(int amount, int limitAmount) { //생성자
        super(amount);
        creditLimitAmount = limitAmount;
    }
    public MinusAccount(String name, int amount) { super(name, amount);}
    // 추상메소드 구현
    public void deposit(int amount) { plusBalance(amount); }
    public void withdraw(int amount) {
        if ((getBalance() + creditLimitAmount) >= amount) minusBalance(amount);
    }
}