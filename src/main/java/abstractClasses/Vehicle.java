package abstractClasses;

import carParts.*;
import enums.Gears;

import java.util.ArrayList;

public abstract class Vehicle {
  private int noOfSeats, noOfTyres, distanceTravelled;
  private Engine engine;
  private ArrayList<Tyre> tyres;
  private ArrayList<Seat> seats;
  private Chassis chassis;
  private SteeringWheel steeringWheel;

  public Vehicle(Engine engine, Tyre tyre, int noOfTyres, Chassis chassis, Seat seat, int noOfSeats,
                 SteeringWheel steeringWheel) {
    this.noOfSeats = noOfSeats;
    this.noOfTyres = noOfTyres;
    this.engine = engine;
    for (int i = 0; i < noOfTyres; i++) {
      this.tyres.add(tyre);
    }
    for (int i = 0; i < noOfSeats; i++) {
      this.seats.add(seat);
    }
    this.chassis = chassis;
    this.steeringWheel = steeringWheel;
    this.distanceTravelled = 0;
  }

  public int getNoOfSeats() {
    return noOfSeats;
  }

  public int getNoOfTyres() {
    return noOfTyres;
  }

  public int getDistanceTravelled() {
    return distanceTravelled;
  }

  public Engine getEngine() {
    return engine;
  }

  public ArrayList<Tyre> getTyres() {
    return tyres;
  }

  public ArrayList<Seat> getSeats() {
    return seats;
  }

  public Chassis getChassis() {
    return chassis;
  }

  public SteeringWheel getSteeringWheel() {
    return steeringWheel;
  }

  public void drive(int distance) {
    this.distanceTravelled += distance;
  }

  public void park() {
    getEngine().changeGear(Gears.NEUTRAL);
    getEngine().stop();
  }

  public void changeGear(Gears gear) {
    getEngine().changeGear(gear);
  }

  public void changeGearWithPaddle(Gears gear) {
    if (getSteeringWheel().getPaddles()) {
      getEngine().changeGear(gear);
    }
  }
}
