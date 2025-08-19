public class Main70 {
    public static void main(String[] args) {
        int x = 5;
        int result = x++ - --x + x-- - --x;
        System.out.println(result);
    }
}
