public class Square implements Shapeable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        double answer;
        answer = side * 4;
        return answer;
    }

    @Override
    public double getArea() {
        double answer;
        answer = side * side;
        return answer;
    }
}