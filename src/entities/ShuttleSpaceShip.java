/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author smono27
 */
public class ShuttleSpaceShip extends SpaceShip {

    public ShuttleSpaceShip(String color, float weight) {
        super(color, weight);
    }
            
    @Override
    public void Launch(){
        this.setVelocity(912);
        this.setHeight(76);        
    }    

    @Override
    public void stopLaunch() {
        this.setVelocity(200);
    }

}
