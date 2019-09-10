//import java.util.Scanner;
 
public class Q9_1 
{
    public static void main(String[] args) 
    {
        //Scanner sc = new Scanner(System.in);
         
        //System.out.println("Enter a string to be cleaned without white spaces...!");
         
        //String input = sc.nextLine();
        
		String input = "I am Happy ";
        String WithoutSpaces = input.replaceAll("\\s+", "");
		
         
        System.out.println("Input String : "+input);
         
        System.out.println("String Without Spaces : "+ WithoutSpaces);
         
        //sc.close();
    }
}