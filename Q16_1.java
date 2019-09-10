    public class Q16_1
	{    
		public static int linearSearch(int[] array, int key)
		{    
				for(int i=0;i<array.length;i++)
				{    
					if(array[i] == key)
					{    
						return i;    
					}    
				}    
				return -1;    
		}    
		public static void main(String a[])
		{    
				int[] num= {10,25,30,45,60,80};    
				int key = 60;    
				System.out.println(key +" is found in the array at index: "+linearSearch(num, key));    
		}    
    }    