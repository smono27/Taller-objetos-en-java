/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 * Class that refers to a bank related to city class
 *
 * @author smono27
 */
public class Bank {

    public String name;
    private ArrayList<Person> customers;

    /**
     * Bank class constructor without parameters
     */
    public Bank() {
    }

    /**
     * Bank class constructor with parameters
     *
     * @param name bank name
     * @param customers list of current bank customers
     */
    public Bank(String name, ArrayList<Person> customers) {
        this.name = name;
        this.customers = customers;
    }

    /**
     *
     * @return current bank name
     */
    public String getName() {
        return name;
    }

    /**
     * Modify or replace the current bank name
     *
     * @param name new bank name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param position array index position
     * @return customer class object from customers arraylist curent index
     */
    public Person getCustomer(int position) {
        return customers.get(position);
    }

    /**
     * Modify or replace customer class object from customers arraylist
     * current index
     *
     * @param position array index position
     * @param customer new person class object
     */
    public void setCustomers(int position, Person customer) {
        customers.set(position, customer);
    }
}
