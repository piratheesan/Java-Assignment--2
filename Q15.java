import java.util.*;
class Q15
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of p: ");
        double p=sc.nextDouble();

        System.out.print("Enter the value of r: ");
        double r=sc.nextDouble();

        System.out.print("Enter the value of n: ");
        double n=sc.nextDouble();

        double v1=1+r;
        double v2=Math.pow(v1,n);
        double v=p*v2;
        Double ans=new Double(v);
        System.out.println(ans);
    }
}