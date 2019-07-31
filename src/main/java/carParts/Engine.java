package carParts;

import enums.Gears;

public class Engine {
  private double size;
  private String type, fuelType;
  private Boolean running;
  private Gears gear;

  public Engine(double size, String type, String fuelType, Gears gear) {
    this.size = size;
    this.type = type;
    this.fuelType = fuelType;
    this.gear = gear;
    this.running = false;

  }

  public double getSize() {
    return this.size;
  }

  public String getType() {
    return this.type;
  }

  public String getFuelType() {
    return this.fuelType;
  }

  public Gears getGear() {
    return this.gear;
  }

  public void start(){
    this.running = true;
  }

  public Boolean checkRunning() {
    return running;
  }

  public void changeGear(Gears gear){
    this.gear = gear;
  }
}
