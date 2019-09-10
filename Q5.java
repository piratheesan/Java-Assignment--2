import java.util.Scanner;


public class Q5 
{

    public static void main(String[] args) 
	{
        System.out.println("Enter a number");
        Scanner  sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        for(int i=1;i<=m;i++){
            if(m%i == 0)
			{
                System.out.print(i + " ");
            }
        }
    }
    
}