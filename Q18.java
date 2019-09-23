class Q18 {

	public static void main(String[] args)
	{
		int array[][] =new int [2][2];
		array[0][0]=1;
		array[0][1]=2;
		array[1][0]=3;
		array[1][1]=4;

		int array2[][] =new int [2][2];
		array2[0][0]=1;
		array2[0][1]=6;
		array2[1][0]=4;
		array2[1][1]=8;
	
		for(int i=0; i<2;i++)
		{
			for(int x=0; x<2;x++)
			{
				System.out.println(array[i][x] + array2[i][x]);
			}

		}

	}

}
