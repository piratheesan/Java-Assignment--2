public class Q2 {

      public static void main(String[] args) {
        int num = 10;
        long factorial = 1;
        
        for(int i = 1;i<=num;++i){
            factorial = factorial*i;
        }
        System.out.printf("Factorial of no %d = %d",num,factorial);
    }
    
}