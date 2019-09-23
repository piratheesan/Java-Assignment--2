class Q19 {

	public static void main(String[] args) 
	{
		
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};  
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};  
  
		int c[][]=new int[3][3]; 


		for (int i=0; i<a.length ;i++ ) {
			
			for (int j=0;j<a.length ;j++ ) {

				for (int k=0;k<a.length ;k++ ) 
				{
					c[i][j]+= a[j][k]*b[k][j];
					System.out.print(a[j][k]*b[k][j]);				

				}
				System.out.print(" ");
				
			}
			System.out.print("");
		}
  	}

}
