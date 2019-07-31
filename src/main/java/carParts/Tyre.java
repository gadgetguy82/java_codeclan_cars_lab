package carParts;

public class Tyre {
  private int size, pressure, maxPressure, tread;
  private String type;

  public Tyre(int size, String type, int pressure, int maxPressure, int tread) {
    this.size = size;
    this.type = type;
    this.pressure = pressure;
    this.maxPressure = maxPressure;
    this.tread = tread;
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

  public void inflate() {
    if (pressure < maxPressure) {
      this.pressure = maxPressure;
    }
  }

  public int checkTread() {
    return this.tread;
  }
}
