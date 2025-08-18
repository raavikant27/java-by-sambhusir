
public class Program5 {
    public static void main(String[] args) {
        char c1 = 'A';   // Unicode value 65
        char c2 = 65;    // 65 also corresponds to 'A'

        // Comparisons
        System.out.println(c1 == c2);   // true, both are 'A'
        System.out.println(c1 < 'a');   // true, 'A'(65) < 'a'(97)
        System.out.println('Z' < 'a');  // true, 'Z'(90) < 'a'(97)
    }
}
