package Hw1_5.Entity;

class NormalAccount extends Account {


    public NormalAccount(int amount) { //생성자
        super(amount);
    }
    public NormalAccount(String name,int amount){super(name, amount);}
    // 추상메소드 구현
    public void deposit(int amount) { plusBalance(amount); }
    public void withdraw(int amount) {
        if (getBalance() >= amount) minusBalance(amount);
    }
}