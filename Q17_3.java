class Q17_3 
{ 

    public static void insertionSort(int array[]) 
	{  
        int num = array.length;  
        for (int j = 1; j < num; j++) 
		{  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) 
			{  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[])
	{    
        int[] arr1 = {9,14,3,2,43,11,58,22};    
        System.out.println("Array before sorted using Insertion sort");    
        for(int i:arr1)
		{    
            System.out.print(i+" ");    
        }    
        System.out.println("\n\n");             
        insertionSort(arr1);               
        System.out.println("Array after sorted using Insertion sort");    
        for(int i:arr1)
		{    
            System.out.print(i + " ");    
        }    
    }    
}    