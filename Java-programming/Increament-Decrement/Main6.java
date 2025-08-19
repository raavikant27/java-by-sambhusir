public class Main6 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = x-- - --y + x++ + ++y;
        System.out.println(z);
    }
}
