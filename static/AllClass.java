
class AllShapes {

    public static void main(String[] args) {

        // =================== RECTANGLE ===================
        System.out.println("----- Rectangle -----");
        getRectangleArea(12.8, 8.2);
        getRectanglePerimeter(12.8, 8.2);

        // =================== CIRCLE ===================
        System.out.println("\n----- Circle -----");
        getCircleArea(7);
        getCirclePerimeter(7);

        // =================== CUBE ===================
        System.out.println("\n----- Cube -----");
        getCubeSurfaceArea(5);
        getCubeVolume(5);

        // =================== CUBOID ===================
        System.out.println("\n----- Cuboid -----");
        getCuboidSurfaceArea(10, 5, 3);
        getCuboidVolume(10, 5, 3);

        // =================== SOLID CYLINDER ===================
        System.out.println("\n----- Solid Cylinder -----");
        getSolidCylinderCSA(4, 10);
        getSolidCylinderTSA(4, 10);
        getSolidCylinderVolume(4, 10);

        // =================== HOLLOW CYLINDER ===================
        System.out.println("\n----- Hollow Cylinder -----");
        getHollowCylinderCSA(3, 5, 10);
        getHollowCylinderTSA(3, 5, 10);
        getHollowCylinderVolume(3, 5, 10);

        // =================== CYLINDER USING DIAMETER ===================
        System.out.println("\n----- Cylinder From Diameter -----");
        getCylinderFromDiameter(8, 10);
    }

    // RECTANGLE
    public static void getRectangleArea(double l, double w) {
        System.out.println("Length: " + l + ", Width: " + w);
        System.out.println("Area = " + (l * w) + " Sq. Unit");
    }

    public static void getRectanglePerimeter(double l, double w) {
        System.out.println("Perimeter = " + (2 * (l + w)) + " Unit");
    }

    // CIRCLE
    public static void getCircleArea(double r) {
        System.out.println("Radius: " + r);
        System.out.println("Area = " + (Math.PI * r * r) + " Sq. Unit");
    }

    public static void getCirclePerimeter(double r) {
        System.out.println("Perimeter = " + (2 * Math.PI * r) + " Unit");
    }

    // CUBE
    public static void getCubeSurfaceArea(double a) {
        System.out.println("Side: " + a);
        System.out.println("Surface Area = " + (6 * a * a) + " Sq. Unit");
    }

    public static void getCubeVolume(double a) {
        System.out.println("Volume = " + (a * a * a) + " Cubic Unit");
    }

    // CUBOID
    public static void getCuboidSurfaceArea(double l, double w, double h) {
        System.out.println("Length: " + l + ", Width: " + w + ", Height: " + h);
        double surfaceArea = 2 * (l * w + w * h + h * l);
        System.out.println("Surface Area = " + surfaceArea + " Sq. Unit");
    }

    public static void getCuboidVolume(double l, double w, double h) {
        System.out.println("Volume = " + (l * w * h) + " Cubic Unit");
    }

    // SOLID CYLINDER
    public static void getSolidCylinderCSA(double r, double h) {
        System.out.println("Radius: " + r + ", Height: " + h);
        System.out.println("Curved Surface Area = " + (2 * Math.PI * r * h) + " Sq. Unit");
    }

    public static void getSolidCylinderTSA(double r, double h) {
        System.out.println("Total Surface Area = " + (2 * Math.PI * r * (r + h)) + " Sq. Unit");
    }

    public static void getSolidCylinderVolume(double r, double h) {
        System.out.println("Volume = " + (Math.PI * r * r * h) + " Cubic Unit");
    }

    // HOLLOW CYLINDER
    public static void getHollowCylinderCSA(double r1, double r2, double h) {
        System.out.println("Inner Radius: " + r1 + ", Outer Radius: " + r2 + ", Height: " + h);
        System.out.println("Curved Surface Area = " + (2 * Math.PI * h * (r1 + r2)) + " Sq. Unit");
    }

    public static void getHollowCylinderTSA(double r1, double r2, double h) {
        double csa = 2 * Math.PI * h * (r1 + r2);
        double capArea = 2 * Math.PI * (r2 * r2 - r1 * r1);
        System.out.println("Total Surface Area = " + (csa + capArea) + " Sq. Unit");
    }

    public static void getHollowCylinderVolume(double r1, double r2, double h) {
        System.out.println("Volume = " + (Math.PI * h * (r2 * r2 - r1 * r1)) + " Cubic Unit");
    }

    // CYLINDER USING DIAMETER
    public static void getCylinderFromDiameter(double diameter, double h) {
        double r = diameter / 2.0;
        System.out.println("Diameter: " + diameter + ", Converted Radius: " + r);
        getSolidCylinderCSA(r, h);
        getSolidCylinderTSA(r, h);
        getSolidCylinderVolume(r, h);
    }
}
