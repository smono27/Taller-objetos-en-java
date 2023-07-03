/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Class that refers to a transaction
 *
 * @author smono27
 */
public class Transaction {

    private int serial;
    private String description;

    /**
     * Transaction class contructor without parameters
     */
    public Transaction() {
    }

    /**
     * Transaction class contructor with parameters
     *
     * @param serial transaction serial number
     * @param description transaction description
     */
    public Transaction(int serial, String description) {
        this.serial = serial;
        this.description = description;
    }

    /**
     *
     * @return transaction serial number
     */
    public int getSerial() {
        return serial;
    }

    /**
     *
     * @return transaction description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Modify or replace transaction description
     *
     * @param description new transaction description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
