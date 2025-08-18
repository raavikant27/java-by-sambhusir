
public class Allwork1 {

    // =================== CUBE ===================
    public static String getCube(double side) {
        double volume = side * side * side;
        double surfaceArea = 6 * side * side;
        return "Cube Side: " + side + " Unit\n" +
               "Volume: " + volume + " Cubic Unit\n" +
               "Surface Area: " + surfaceArea + " Sq. Unit\n" +
               "--------------------------------";
    }

    // =================== RECTANGLE ===================
    public static String getRectangle(double length, double width) {
        double area = length * width;
        double perimeter = 2 * (length + width);
        return "Rectangle Length: " + length + " Width: " + width + " Unit\n" +
               "Area: " + area + " Sq. Unit\n" +
               "Perimeter: " + perimeter + " Unit\n" +
               "--------------------------------";
    }

    // =================== TRIANGLE ===================
    public static String getTriangle(double base, double height) {
        double area = 0.5 * base * height;
        return "Triangle Base: " + base + " Height: " + height + " Unit\n" +
               "Area: " + area + " Sq. Unit\n" +
               "--------------------------------";
    }

    // =================== CIRCLE ===================
    public static String getCircle(double radius) {
        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;
        return "Circle Radius: " + radius + " Unit\n" +
               "Area: " + area + " Sq. Unit\n" +
               "Circumference: " + circumference + " Unit\n" +
               "--------------------------------";
    }

    // =================== SQUARE ===================
    public static String getSquare(double side) {
        double area = side * side;
        double perimeter = 4 * side;
        return "Square Side: " + side + " Unit\n" +
               "Area: " + area + " Sq. Unit\n" +
               "Perimeter: " + perimeter + " Unit\n" +
               "--------------------------------";
    }

    // =================== CYLINDER ===================
    public static String getCylinder(double radius, double height) {
        double volume = 3.14 * radius * radius * height;
        double surfaceArea = 2 * 3.14 * radius * (radius + height);
        return "Cylinder Radius: " + radius + " Height: " + height + " Unit\n" +
               "Volume: " + volume + " Cubic Unit\n" +
               "Surface Area: " + surfaceArea + " Sq. Unit\n" +
               "--------------------------------";
    }

    // =================== CUBOID ===================
    public static String getCuboid(double length, double width, double height) {
        double volume = length * width * height;
        double surfaceArea = 2 * (length * width + width * height + height * length);
        return "Cuboid Length: " + length + " Width: " + width + " Height: " + height + " Unit\n" +
               "Volume: " + volume + " Cubic Unit\n" +
               "Surface Area: " + surfaceArea + " Sq. Unit\n" +
               "--------------------------------";
    }

    // =================== MAIN ===================
    public static void main(String[] args) {

        // CUBE
        System.out.println(getCube(3));
        System.out.println(getCube(4));

        // RECTANGLE
        System.out.println(getRectangle(12, 8));
        System.out.println(getRectangle(20, 12));
        System.out.println(getRectangle(34, 18));

        // TRIANGLE
        System.out.println(getTriangle(6, 4));
        System.out.println(getTriangle(8, 5));

        // CIRCLE
        System.out.println(getCircle(7));
        System.out.println(getCircle(10));

        // SQUARE
        System.out.println(getSquare(5));
        System.out.println(getSquare(9));

        // CYLINDER
        System.out.println(getCylinder(3, 10));
        System.out.println(getCylinder(4, 12));

        // CUBOID
        System.out.println(getCuboid(5, 3, 2));
        System.out.println(getCuboid(10, 6, 4));
    }
}
