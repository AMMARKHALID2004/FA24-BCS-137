public class Circle extends Shape2D implements Drawable {


    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public Circle(String name, boolean isFilled, double radius) {
        super(name, isFilled);
        this.radius = radius;
    }

    public double area() {
        double ar=Math.PI * radius * radius;
        return ar;
    };

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + area() +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("This is a circle");

    }
    Point center=new Point(0,0);
}




