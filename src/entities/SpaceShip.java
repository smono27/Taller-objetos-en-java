/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author smono27
 */
public abstract class SpaceShip implements ShipInterface{
    
    private final String color;
    private final float weight;
    private float height;
    private float velocity;
        
    protected SpaceShip(String color, float weight) {
        this.color = color;
        this.weight = weight;
        height = 0;
        velocity = 0;
    }

    protected static String getOrigin() {
        return origin;
    }

    protected String getColor() {
        return color;
    }

    protected float getWeight() {
        return weight;
    }

    protected float getHeight() {
        return height;
    }

    protected void setHeight(float height) {
        this.height += height;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }
      
    @Override
    public boolean isOutOfOrbit(){
        return height>10000000.0;
    }
        
    @Override
    public void Launch(){
        velocity = 300;
        height += 25;        
    }
    
    public abstract void Accelerate(int rpm);
    public abstract void stopLaunch();
    
}
