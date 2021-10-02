public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius > 0 ? radius : -1;
    }

    @Override
    public String toString() {
        return getRadius() > 0 ? "Circle{" +
                "radius=" + radius + ", square = " + getSquare() + ", circumference = " + getCircumference() +
                '}' : "Error circle: radius = " + getRadius();
    }

    public double getSquare()
    {
        return getRadius()*getRadius()*Math.PI;
    }

    public double getCircumference()
    {
        return 2*Math.PI*getRadius();
    }
}
