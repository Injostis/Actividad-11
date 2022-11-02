public class Circle implements Shapeable{
    private double pi = 3.1416;
    private double radius;
    private double diameter;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double getPerimeter() {
        double answer;
        answer = diameter * pi;
        return answer;
    }

    @Override
    public double getArea() {
        double answer;
        answer = pi * (radius * radius);
        return answer;
    }
}