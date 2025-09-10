class Program3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            if(i%2!=0){
                sum=sum+i;
            }
            i++;
        }

        System.out.println("Sum of  odd numbers from 1 to 100 = " + sum);
    }
}
