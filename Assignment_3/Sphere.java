public class Sphere extends Shape3D implements Drawable{
    private double radius;

    public Sphere(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    public double area() {
        return 4*Math.PI * radius * radius;
    }
        public double volume() {
            return (4.0/3)*Math.PI*radius*radius*radius;


        }

    @Override
    public String toString() {
        return "Sphere{" +
                "area =" + area() + ", volume =" +volume()+
                '}';


    }

    @Override
    public void draw() {
        System.out.println("This is a sphere.");

    }
}
