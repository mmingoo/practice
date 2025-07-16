package jungsuck.ch13;

public class test {
    volatile long balance;
    synchronized long getBalance(){
        return balance;
    }

    synchronized void withdraw(int money){
        if(balance >= money){
            balance -= money;
        }
    }
}
