/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author smono27
 */
public abstract class SpaceShip implements ShipInterface{
    
    private final String color;
    private final float weight;
    private float height;
        
    protected SpaceShip(String color, float weight) {
        this.color = color;
        this.weight = weight;
        height = 0;
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
        this.height = height;
    }
      
    @Override
    public boolean isOutOfOrbit(){
        return height>10000000.0;
    }
        
    @Override
    public void Launch(int velocity){
        if(velocity <= 100) height += 1000;
        else if (velocity <= 200) height += 2500; 
        else height += 4000;
    }
    
    public abstract void Accelerate();
    public abstract void stopLaunch();
    
}
