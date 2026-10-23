package com.nit.exceptionhandling;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class OverdraftLimitExceededException extends Exception {
    public OverdraftLimitExceededException(String message) {
        super(message);
    }
}
interface AccountOperations {
   public void deposit(double amount);
   public void withdraw(double amount) throws InsufficientBalanceException, OverdraftLimitExceededException;
}

abstract class BankAccount implements AccountOperations {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current balance: " + balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
}

class CurrentAccount extends BankAccount {
   
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current balance: " + balance);
    }

    @Override
    public void withdraw(double amount) throws OverdraftLimitExceededException {
        if (amount > balance + overdraftLimit) {
            throw new OverdraftLimitExceededException("Overdraft limit exceeded!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("S001", 1000);
        CurrentAccount current = new CurrentAccount("C001", 500, 200);

        // Valid tests
        try {
            savings.deposit(500); // 1500
            current.withdraw(650); // -150
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Invalid tests
        try {
            savings.withdraw(2000); // Throws exception
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            current.withdraw(800); // Throws overdraft exception
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}