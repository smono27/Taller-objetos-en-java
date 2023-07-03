/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 * Class that refers to a person
 *
 * @author smono27
 */
public class Person {

    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    /**
     * Person class constructor without parameters
     */
    public Person() {
    }

    /**
     * Person class constructor with parameters
     *
     * @param name person name
     * @param lastName1 first person last name
     * @param lastName2 second person last name
     * @param dateBirth date of person birth
     * @param height person height
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     *
     * @return current person name
     */
    public String getName() {
        return name;
    }

    /**
     * Modify or replace current person name
     *
     * @param name new person name
     */
    public void setName(String name) {
        this.name = name;
    }

}
