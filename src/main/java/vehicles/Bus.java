package vehicles;


import abstractClasses.Vehicle;
import carParts.*;

public class Bus extends Vehicle{

    private boolean isSchoolBus;

    public Bus(Engine engine, Tyre tyre,  Chassis chassis, Seat seat, int noOfSeats, SteeringWheel steeringWheel, boolean isSchoolBus) {
        super(engine, tyre, 8, chassis, seat, noOfSeats, steeringWheel);
        this.isSchoolBus = isSchoolBus;
    }

    public boolean getisSchoolBus(){
        return isSchoolBus;
    }


}
