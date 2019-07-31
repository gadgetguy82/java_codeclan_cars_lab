package carParts;

public class Seat {
  private String material, type;
  private boolean seatBelt, fastened;
  private int angle;

  public Seat(String material, String type, boolean seatBelt, int angle) {
    this.material = material;
    this.type = type;
    this.seatBelt = seatBelt;
    this.fastened = false;
    this.angle = angle;
  }

  public String getMaterial() {
    return this.material;
  }

  public String getType() {
    return type;
  }

  public boolean getSeatBelt() {
    return seatBelt;
  }

  public boolean checkFastened() {
    return this.fastened;
  }

  public void buckle() {
    this.fastened = true;
  }

  public void unbuckle() {
    this.fastened = false;
  }

  public int getAngle() {
    return this.angle;
  }

  public void recline(int angle) {
    this.angle = angle;
  }
}
