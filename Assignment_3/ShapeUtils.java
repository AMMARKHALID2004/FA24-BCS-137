public class ShapeUtils {
    public static void displayShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        }

        public static void drawDrawables(Drawable[] drawables) {
        for (int i = 0; i < drawables.length; i++) {
            drawables[i].draw();
        }
        }
        public static  boolean Intersect(Shape[] shape, Rectangle otherrectangle ) {
            for (Shape s : shape) {
                if (s instanceof Rectangle) {
                    if(((Rectangle)s).getGetTopLeftCorner().getX()>otherrectangle.getGetTopLeftCorner().getX()) {
                        return true;
                    }
                    if(((Rectangle)s).getGetTopLeftCorner().getY()>otherrectangle.getGetTopLeftCorner().getY()) {
                        return true;
                    }



                }
            }
            return true;


        }

    }
