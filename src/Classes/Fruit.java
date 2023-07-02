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
public class Fruit {

    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    public Fruit() {
    }

    public void setColor(int position, String name) {
        this.colors.set(position, name);
    }

    public ArrayList<String> getColors() {
        return this.colors;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public float getAverageWeight() {
        return averageWeight;
    }
}
