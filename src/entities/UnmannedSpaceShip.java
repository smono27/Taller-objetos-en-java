/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author smono27
 */
public class UnmannedSpaceShip extends SpaceShip {

    public UnmannedSpaceShip(String color, float weight) {
        super(color, weight);
    }

    @Override
    public void Accelerate(int rpm) {
        if (rpm == 10000) {
            this.setVelocity(504);
            this.setHeight(42);            
        } else if (rpm == 15000) {
            this.setVelocity(708);
            this.setHeight(59);            
        } else {
            this.setVelocity(912);
            this.setHeight(76);            
        }
    }

    @Override
    public void stopLaunch() {
        this.setVelocity(50);
    }

}
