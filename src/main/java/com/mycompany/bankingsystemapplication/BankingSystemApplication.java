/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankingsystemapplication;

/**
 *
 * @author RC_Student_lab
 */
public class BankingSystemApplication {

  public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount("13159017768", 1000, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount("2047099974", 500, 1000);

        bank.addAccount(savingsAccount);
        bank.addAccount(checkingAccount);

        savingsAccount.deposit(500);
        checkingAccount.withdraw(200);

        savingsAccount.addInterest();

        bank.printAccountBalances();
    }
}
  
