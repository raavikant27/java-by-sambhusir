public class Main11 {
    public static void main(String[] args) {
        int a = 12;
        a++;
        ++a;
        int b = a++;
        b++;
        int c = a++ + --b;
        c--;
        --b;
        int d = ++a + b++ + --c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
