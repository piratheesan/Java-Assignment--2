import java.util.Arrays;
import java.util.Scanner;


public class Q24_A {
									
    public static void main(String[] args) 
	{
		int[][] stud = new int[5][3];
		int totalmax=0;
		int stuid=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5;i++)
		{			
			 System.out.println( "Enter marks of student " +(i+1));
			 for(int j=0;j<3;j++)
			 {
				 System.out.println( "Enter marks : "+(j+1) );
				 stud[i][j]=sc.nextInt();
			 }
		}
		for(int i = 0; i < 5; i++)
		{			
			int sum=0, avg=0;	
					
			System.out.println("Marks of Student " + (i+1));
			for(int j = 0; j < 3; j++)
			{
			   System.out.println("Subject " + (j+1) + ":" + stud[i][j]);
			   sum += stud[i][j];
			   			   
			   if(totalmax<sum)
					{
						totalmax=sum;
						stuid=i+1;
					}			   
			}						
			//avg = sum/3;
			System.out.println("Total marks for Student " + (i+1) +" is " + sum);
			//System.out.println("Average of 3 marks for Student " + (i+1) + " is " + avg);			
			}
			int max[]=new int[3];
			int id[]=new int [3];
			max[0] = stud[0][0];			
			for(int i=0;i<5;i++)
			{
				int k;				
				for(k=0;k<3;k++)
				{
					if(max[k]<stud[i][k])
					   {
						   max[k]=stud[i][k];
						   id[k]=i+1;
					   }
				}				
				System.out.println();
			}
			for(int j=0;j<3;j++)
				{
					System.out.println("Maximum for Subject " +(j+1) + " is : " + max[j]+ " & Roll No . of the student who secured it is  : " + id[j]);
				}				
			System.out.println("Maximum total is : " + totalmax + " & ID of student who obtained the highest total marks is : " + stuid);		
    }
}