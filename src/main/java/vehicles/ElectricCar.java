package vehicles;

import abstractClasses.Vehicle;
import carParts.*;

public class ElectricCar extends Vehicle {
  private String battery;

  public ElectricCar(Engine engine, Tyre tyre, Chassis chassis, Seat seat, int noOfSeats, SteeringWheel steeringWheel, String battery) {
    super(engine, tyre, 4, chassis, seat, noOfSeats, steeringWheel);
    this.battery = battery;
  }

  public String getBattery() {
    return this.battery;
  }
}
