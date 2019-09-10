import java.util.Arrays;  
	
	public class Q16_2
	{  
		public static void main(String args[])
		{  
			int array[] = {10,11,12,13,14};  
			int key = 13;  
			int result = Arrays.binarySearch(array,key);  
			if (result < 0)
			{
				System.out.println("Element is not found!");
			}				
				  
			else  
			{
				System.out.println("Element is found at index: "+result); 
			}
		}
				 
    }  
      