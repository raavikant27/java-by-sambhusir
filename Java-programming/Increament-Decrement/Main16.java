public class Main16 {
    public static void main(String[] args) {
        int p = 5, q = 2;
        p *= ++q + p++;
        System.out.println(p + " " + q);
    }
}
