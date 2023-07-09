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
    public void Accelerate(int rpm) {
        if (rpm == 10000) {
            this.setVelocity(600);
            this.setHeight(50);            
        } else if (rpm == 15000) {
            this.setVelocity(900);
            this.setHeight(75);            
        } else {
            this.setVelocity(1200);
            this.setHeight(100);            
        }
    }

    @Override
    public void stopLaunch() {
        this.setVelocity(200);        
    }

}
