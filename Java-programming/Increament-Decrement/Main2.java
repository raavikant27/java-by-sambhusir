public class Main2 {
    public static void main(String[] args) {
        int a = 20;
        a++;
        int b = a++;
        int c = ++b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
