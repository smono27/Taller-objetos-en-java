/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 * Class that refers to a bank account
 * @author smono27
 */
public class BankAccount {

    private int accountNumber;
    protected boolean activated;
    private ArrayList<Transaction> transactions;

    /**
     * BankAccount constructor without parameters
     */
    public BankAccount() {
    }

    /**
     * BankAccount constructor with parameters
     *
     * @param accountNumber account number
     * @param activated state of bank account
     * @param transactions list of transactions associated to bank account
     */
    public BankAccount(int accountNumber, boolean activated, ArrayList<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.activated = activated;
        this.transactions = transactions;
    }

    /**
     *
     * @return current account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Modify or replace current account number
     *
     * @param accountNumber new account number
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *
     * @return bank account state
     */
    public boolean getActived() {
        return activated;
    }

    /**
     * Modify or replace current bank account state
     *
     * @param activated new bank account state
     */
    public void setActived(boolean activated) {
        this.activated = activated;
    }

    /**
     *
     * @param position array index position
     * @return Transaction class object from transactions array list
     */
    public Transaction getTransaction(int position) {
        return transactions.get(position);
    }

    /**
     * Modify or replace Transaction class object from transactions
     * array list current index 
     *
     * @param position array index position
     * @param transaction new Transaction class object
     */
    public void setTransactions(int position, Transaction transaction) {
        transactions.set(position, transaction);
    }

}
