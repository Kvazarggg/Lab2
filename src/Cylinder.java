public class Cylinder extends Circle {

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : -1;
    }

    @Override
    public double getSquare() {
        return super.getSquare()*2 + super.getCircumference()*getHeight();
    }

    public double getVolume() {
        return super.getSquare() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" + "radius = " + getRadius()
                + ", height=" + height + ", square = " + this.getSquare()
                + ", volume = " + this.getVolume() + '}';
    }
}
