/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package clases;

/**
 *
 * @author smono27
 */
public interface ShipInterface {
    String origin = "US"; 
    boolean isOutOfOrbit();
    void Launch(int velocity);
}
