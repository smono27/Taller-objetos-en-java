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
    public void Launch() {
        this.setVelocity(720);
        this.setHeight(60);
    }

    @Override
    public void stopLaunch() {
        this.setVelocity(50);
    }

}
