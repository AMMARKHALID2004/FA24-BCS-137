public class Cube extends Shape3D implements Drawable{
    private double side;

    public Cube(String name, double side) {
        super(name);
        this.side = side;
    }
    public double volume(){
        return side * side * side;
    }
    public double area(){
        return 6*side*side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "area=" + area() + ", volume="+ volume() +
                '}';
    }
    @Override
    public void draw(){
        System.out.println("This is a cube.");
    }
}
