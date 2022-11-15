interface IAccount { // Define account’s interface
    public  int       getAccNum();
    public  int       getBalance();
    public  void   deposit(int amount);
    public  void   withdraw(int amount);

    public  void   showAccount(); // For test

} // 또는 abstract class

abstract class Account implements IAccount { /* For code sharing */
    private static int lastAccountNumber = 0;
    // Object’s state
    private int accountNumber;
    private int balance;

    public Account(int amount) { accountNumber = nextAccNum(); balance = amount; }

    // Object’s Interface
    public int getAccNum() { return accountNumber; }
    public int getBalance() { return balance; }
    public abstract void deposit(int amount); // 계좌 유형에 따라 입금 방법이 다름 (예)적금계좌
    public abstract void withdraw(int amount);// 계좌 유형에 따라 출금 방법이 다름 (예)마이너스계좌

    // For subclasses
    protected void minusBalance(int amount)    { balance -= amount; }
    protected void plusBalance(int amount) { balance += amount; }
    protected static int nextAccNum()     { return ++lastAccountNumber; }

    public void showAccount() { // For test
        System.out.printf("%04d-%04d %10d%n", accountNumber/1000, accountNumber%10000, balance);
    }
} // 또는 Concrete class (Called Adapter class)

class NormalAccount extends Account {
    public NormalAccount(int amount) { //생성자
        super(amount);
    }
    // 추상메소드 구현
    public void deposit(int amount) { plusBalance(amount); }
    public void withdraw(int amount) {
        if (getBalance() >= amount) minusBalance(amount);
    }
}

class MinusAccount extends Account {
    private int creditLimitAmount; // 추가
    public MinusAccount(int amount, int limitAmount) { //생성자
        super(amount); creditLimitAmount = limitAmount;
    }
    // 추상메소드 구현
    public void deposit(int amount) { plusBalance(amount); }
    public void withdraw(int amount) {
        if ((getBalance() + creditLimitAmount) >= amount) minusBalance(amount);
    }
}
public class Hw1_4 {
    public static void main(String[] args) {
        // IAccount: 참조변수의 선언타입 – 호출가능한 메소드를 결정함
        IAccount HONG, KIM;

        // NormalAccount: 참조변수의 실제타입 – 실제 호출될 클래스를 결정함
        HONG = new NormalAccount(1000); HONG.showAccount();

        HONG.deposit(10000); System.out.print("입금 10000: "); HONG.showAccount();
        HONG.withdraw(5000); System.out.print("출금  5000: "); HONG.showAccount();
        HONG.withdraw(9000); System.out.print("출금  9000: "); HONG.showAccount();
        System.out.println();

        // MinusAccount: 참조변수의 실제타입 – 실제 호출될 클래스를 결정함
        KIM = new MinusAccount(2000, 50000); KIM.showAccount();
        KIM.deposit(20000); System.out.print("입금 20000: "); KIM.showAccount();
        KIM.withdraw(7000); System.out.print("출금  7000: "); KIM.showAccount();
        KIM.withdraw(50000);System.out.print("출금 50000: "); KIM.showAccount();
    } // end of main
} // end of Bank
