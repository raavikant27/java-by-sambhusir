public class Main14 {
    public static void main(String[] args) {
        int a = 8;
        int b = 12;
        int c = ++a + b++;
        c--;
        --b;
        int d = c-- + ++b + ++a;
        int e = a + ++b + c + d++;
        System.out.println(++e);
    }
}
