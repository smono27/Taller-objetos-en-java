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
    public void Accelerate(int rpm) {
        if (rpm == 10000) {
            this.setVelocity(408);
            this.setHeight(34);
        } else if (rpm == 15000) {
            this.setVelocity(516);
            this.setHeight(43);
        } else {
            this.setVelocity(524);
            this.setHeight(52);
        }
    }

    @Override
    public void stopLaunch() {
        this.setVelocity(150);
    }

}
