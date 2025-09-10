class Program18 {
    public static void main(String[] args) {
        
        int i = 1;
        double sum = 0.0;
        while (i <= 99) {
           
            sum=sum+ (1.0/(i*(i+1)));
            i++;
        }
        System.out.println("print the sum  series from 1 to 100 = "+ sum);
    }
}





