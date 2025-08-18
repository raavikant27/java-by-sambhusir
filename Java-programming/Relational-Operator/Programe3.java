public class Programe3 {
    public static void main(String[] args) {
        double d = 0.0 / 0.0;   // NaN

        System.out.println(d == d);
        System.out.println(d != d);
        System.out.println(d < d);
        System.out.println(d > d);
        System.out.println(d <= d);
    }
}
