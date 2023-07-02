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
public class Bank {
    public String name;
    private ArrayList<Person> customers;

    public Bank() {
    }

    public Bank(String name, ArrayList<Person> customers) {
        this.name = name;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getCustomer(int position) {
        return customers.get(position);
    }

    public void setCustomers(int position, Person customer) {
        customers.set(position, customer);
    }   
}
