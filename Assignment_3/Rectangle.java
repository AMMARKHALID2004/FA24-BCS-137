public class Rectangle extends Shape2D implements Drawable{

    private double length;
    private double width;
    private Point TopLeftCorner;
    public Rectangle(String name, boolean isFilled, double length,double width,Point TopLeftCorner) {
        super(name, isFilled);
        this.length = length;
        this.TopLeftCorner = TopLeftCorner;
    }

    public void setGetTopLeftCorner(Point getTopLeftCorner) {
        this.TopLeftCorner = getTopLeftCorner;
    }

    public Point getGetTopLeftCorner() {
        return TopLeftCorner;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }


    public double area(){
        return length*width;
    }
    @Override
    public double perimeter(double length, double width) {
        return 2*length+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area= " + area() +
                ", perimeter= " + perimeter(length, width) +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("This is a rectangle");

    }

}
