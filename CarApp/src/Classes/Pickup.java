package Classes;

import java.awt.Color;

public class Pickup extends Car implements iRefueling {

    private int loadCapacity;
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Pickup(String make, 
                String model, 
                Color color, 
                TypeCar bodyType, 
                int numberWheels, 
                TypeFuel fuel,
                TypeGearbox gearbox, 
                float engineCap) {
        super(make, model, color, bodyType, numberWheels, fuel, gearbox, engineCap);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int gearShift(int gear) {
         return 0;
    }

    @Override
    public void fuel() {
     
    }
    
}
