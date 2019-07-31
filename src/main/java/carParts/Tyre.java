package carParts;

public class Tyre {
  private int size, pressure;
  private String type;

  public Tyre(int size, String type, int pressure) {
    this.size = size;
    this.type = type;
    this.pressure = pressure;
  }

  public int getSize() {
    return this.size;
  }

  public String getType() {
    return this.type;
  }

  public int getPressure() {
    return this.pressure;
  }
}
