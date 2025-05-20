package tdd;

public class Account {

    private int balance;

    public Account(int money){
        balance = money;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int i){
        balance += i;
    }

    public void withdraw(int i){
        if(balance <= i){
            throw new RuntimeException("출금 실패! 기존 잔액:" + balance + ", 출금 요청금액:" + i);
        }
        balance -= i;
    }
}
