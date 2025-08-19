public class Main3 {
    public static void main(String[] args) {
        int a = 12;
        int b = a++;
        b++;
        int c = a++ + --b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
