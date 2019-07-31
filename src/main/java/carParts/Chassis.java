package carParts;

public class Chassis {

    private String shape, material, colour;

    public Chassis(String shape, String material, String colour) {
        this.shape = shape;
        this.material = material;
        this.colour = colour;
    }

    public String getShape() {
        return this.shape;
    }

    public String getMaterial() {
        return this.material;
    }

    public String getColour() {
        return this.colour;
    }
}
