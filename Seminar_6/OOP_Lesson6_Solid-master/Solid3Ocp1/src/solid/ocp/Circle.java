package solid.ocp;

public class Circle implements Shape {
    private Integer radius;

    public Circle(Integer radius) {
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    @Override
    public double GetArea() {

        return Math.PI * Math.pow(getRadius(), 2);
    }

}