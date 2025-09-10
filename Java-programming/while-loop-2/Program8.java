class Program8 {
    public static void main(String[] args) {
        
        int i = 1;
        int sum = 0;
        while (i <= 100) {
           if(i%2!=0){
            sum=sum+i*i;
           }
            i+=2;
        }
        System.out.println("Sum of  square all odd numbers from 1 to 100 = " + sum);
    }
}
