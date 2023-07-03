/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 * Class that refers to a fruit
 * @author smono27
 */
public class Fruit {

    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    /**
     * Fruit class constructor with parameters
     *
     * @param name fruit name
     * @param averageWeight average weight of fruit
     * @param colors colors that fruit can has
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Fruit class constructor with parameters
     */
    public Fruit() {
    }

    /**
     * Modify or replace name from colors arraylist current index
     *
     * @param position
     * @param name
     */
    public void setColor(int position, String name) {
        this.colors.set(position, name);
    }

    /**
     *
     * @return list of colors that fruit can has
     */
    public ArrayList<String> getColors() {
        return this.colors;
    }

    /**
     * Modify or replace current average weight of fruit
     * @param averageWeight new average weight
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     *
     * @return current average fruit weight
     */
    public float getAverageWeight() {
        return averageWeight;
    }
}
