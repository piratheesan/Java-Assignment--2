import java.util.Scanner;
import java.util.Arrays;
	
	public class Q10_2 
	{
        public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);         
			System.out.println("Enter a no of words to be store");
			int store =sc.nextInt();
			String[] words = new String[store];
					
			for(int i=0; i<store; i++)
			{
				
				System.out.print("Enter word " + (i+1) + " : ");
				words[i] = sc.next();
			}
					
            //String[] words = { "HTML", "CSS", "BOOTSTRAP"};
            for(int i = 0; i < (store-1); ++i) 
			{
                for (int j = i + 1; j < store; ++j) 
				{
                    if (words[i].compareTo(words[j]) > 0) 
					{
                        String temp = words[i];
                        words[i] = words[j];
                        words[j] = temp;
                    }
                }
            }
            System.out.println("As In Dictionary order:");
            for(int i = 0; i < store; i++) 
			{
                System.out.println(words[i]);
            }
			
        }
    }