class Q17_2 
{ 
    void sort(int arr[]) 
    { 
        int num = arr.length;   
        for (int i = 0; i < num-1; i++) 
        { 
           
            int min_index = i; 
            for (int j = i+1; j < num; j++)
			{
				if (arr[j] < arr[min_index])
				{
					  min_index = j; 
				}					
                  
			}              
  
            int temp = arr[min_index]; 
            arr[min_index] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  
    
    void Arrayprint(int arr[])  
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    }   
    
    public static void main(String args[]) 
    { 
        Q17_2 ob = new Q17_2(); 
        int arr[] = {64,25,12,22,11};
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + " , "); 
		}
		System.out.println("\n\n"); 
		ob.sort(arr); 
        System.out.println("Sorted array using Selection sort method"); 
        ob.Arrayprint(arr); 
    } 
} 