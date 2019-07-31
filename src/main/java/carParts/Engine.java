package carParts;

public class Engine {
  private double size;
  private String type, fuelType;

  public Engine(double size, String type, String fuelType) {
    this.size = size;
    this.type = type;
    this.fuelType = fuelType;
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
}
