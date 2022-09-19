package com.bogotobogo;

public class BankAccount {

          private double balance;

          public BankAccount(double balance) {
            this.balance = balance;
          }

          public double debit(double dev) {
            if (balance < amount) {
              amount = balance;
            }

            balance -= amount;
            return amount;
          }

}
