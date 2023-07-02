/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author saymo
 */
public class Transaction {
    private int serial;
    private String description;

    public Transaction() {
    }

    public Transaction(int serial, String description) {
        this.serial = serial;
        this.description = description;
    }

    public int getSerial() {
        return serial;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }    
}
