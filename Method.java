// Method.java
public class Method {

    // Method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

     public static int sumarray(int[] arr){
          int sum=0;
        for(int num:arr){
         sum+=num;
        }
     return sum;
      }

   public static int gcd(int a,int b){


      while(b!=0){
    int temp=b;
     b=a%b;
     a=temp;
      }
return a;
}
}

    // Method to print Fibonacci series up to n terms
    public static void fibonacci(int n) {
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}
