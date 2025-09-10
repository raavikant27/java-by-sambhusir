class Program9 {
    public static void main(String[] args) {
        
        int i = 1;
        int sum = 0;
        while (i <= 100) {
           if(i%2!=0){
            sum+=i*i*i;
           }
            i+=2;
        }
        System.out.println("Sum of  Cube all odd numbers from 1 to 100 = " + sum);
    }
}



