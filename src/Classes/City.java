/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 * Class that refers to a city
 *
 * @author smono27
 */
public class City {

    protected String name;
    protected String country;
    protected int population;

    /**
     * City class constructor without parameters
     */
    public City() {
    }

    /**
     * City class constructor with parameters
     * @param name city name
     * @param country country where the city is located
     * @param population number of people that live there
     */
    public City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }
}
