// Main.java
public class Main {
    public static void main(String[] args) {
        int num = 5;

         int[] array={1,2,3,4,5};
        int a=13,int=14;

          
        // Calling factorial method from Method class
        int fact = Method.factorial(num);
        System.out.println("Factorial of " + num + " is: " + fact);

        // Calling fibonacci method from Method class
        Method.fibonacci(num);
         
       int sum = Method.sumArray(array);
        System.out.println("Sum of array elements: " + sum);
          
        
    }
}

