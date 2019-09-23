class Q17_1
{ 
    void bubbleSort(int arr[]) 
    { 
        int num = arr.length; 
        for (int i = 0; i < num-1; i++) 
            for (int j = 0; j < num-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
  
    void Arrayprint(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        Q17_1 ob = new Q17_1(); 
        int arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        ob.bubbleSort(arr);
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i] + " , "); 
		}
		System.out.println("\n\n"); 
        System.out.println("Sorted array using Bubble sort method"); 
        ob.Arrayprint(arr); 
    } 
}