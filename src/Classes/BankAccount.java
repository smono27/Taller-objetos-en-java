/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author saymo
 */
public class BankAccount {
    private int accountNumber;
    protected boolean activated;
    private ArrayList<Transaction> transactions;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean setActived() {
        return activated;
    }

    public void getActived(boolean activated) {
        this.activated = activated;
    }

    public Transaction getTransaction(int position) {
        return transactions.get(position);
    }

    public void setTransactions(int position, Transaction transaction) {
        transactions.set(position, transaction);
    }

    
}
