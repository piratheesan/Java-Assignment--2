public class Q1 
{
    public static void main(String args[]){
    int num = 12345;
    int reversed = 0;
    
    while(num !=0)
	{
		int digit = num% 10;
		//System.out.println(digit);
		reversed = reversed * 10 + digit;
		System.out.println(reversed);
		//num /= 10;
		num=num/10;
    }
        System.out.println("Reversed"
                + " number is " + reversed);
    
    }
    
}