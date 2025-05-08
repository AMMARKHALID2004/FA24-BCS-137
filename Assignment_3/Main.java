public class Main {
    public static void main(String[] args) {

        Shape shape;
        Shape3D shape3D;
        Shape2D shape2D;
        Shape2D circle=new Circle("Circle",true,6.0);
        Shape2D rectangle=new Rectangle("Rectangle",true,3.0,11.0,new Point(3,4));
        Shape2D rectangle2=new Rectangle("Rectangle2",true,4.0,9.0,new Point(3,4));
        Shape2D rectangle3=new Rectangle("Rectangle3",true,3.0,11.0,new Point(2,9));
        Shape3D sphere=new Sphere("Sphere",2.0);
        Shape3D cube =new Cube("Cube",2.0);
        Shape[] shapes=new Shape[20];
        Drawable[] drawables=new Drawable[20];
        ShapeUtils shapeUtils=new ShapeUtils();
        shapes[0]=circle;
        shapes[1]=rectangle;
        shapes[2]=sphere;
        shapes[3]=cube;
        shapes[4]=circle;
        shapes[5]=rectangle2;
        shapes[6]=sphere;
        shapes[7]=cube;
        shapes[8]=circle;
        shapes[9]=rectangle3;
        shapes[10]=sphere;
        shapes[11]=cube;
        shapes[12]=circle;
        shapes[13]=rectangle;
        shapes[14]=sphere;
        shapes[15]=cube;
        shapes[16]=circle;
        shapes[17]=rectangle3;
        shapes[18]=sphere;
        shapes[19]=cube;
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(sphere.toString());
        shapeUtils.displayShapes(shapes);
        Rectangle r = (Rectangle) rectangle2;
        System.out.println("Rectangle is Intersecting: " +shapeUtils.Intersect(shapes,r ));



    }
}
