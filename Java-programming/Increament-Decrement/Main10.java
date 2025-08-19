public class Main10 {
    public static void main(String[] args) {
        int a = 12;
        int b = a++;
        b++;
        int c = a++ + --b;
        int d = a++ + ++b + c++;
        d++;
        c--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}


