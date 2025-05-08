public abstract class Shape {
    private String name;
    public abstract double area();

    public Shape(String name) {
        this.name = name;
    }
    public  double perimeter(double a, double b){
        return 2*a+2*b;
    };

}
