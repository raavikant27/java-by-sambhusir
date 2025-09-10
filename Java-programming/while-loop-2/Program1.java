class Program1 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum += i;   // sum = sum + i
            i++;
        }

        System.out.println("Sum of numbers from 1 to 100 = " + sum);
    }
}
