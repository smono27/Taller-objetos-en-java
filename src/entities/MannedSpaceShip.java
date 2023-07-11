/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author saymo
 */
public class MannedSpaceShip extends SpaceShip {

    public MannedSpaceShip(String color, float weight) {
        super(color, weight);
    }

    @Override
    public void Launch(){
        this.setVelocity(408);
        this.setHeight(34);        
    } 

    @Override
    public void stopLaunch() {
        this.setVelocity(150);
    }

}
