public class Q22

{
	public static void main(String args[])
	{
		int[] arr={3,4,2,4,5,1,1,6,4,3,8,2,4,1,4,3,5,1,4,2,7,2,1,4,6,3,7,5,1,9,5,8,99};
		int[] count=new int[6];

		int p=1,k=0,r=1,d=1;
		for(int i=0; i<6; i++){
			for(int j=0; j<arr.length; j++){
				if(arr[j]==p && i<5){
					count[k]=r;
					r++;
				}
				if(i==5 && arr[j]>5){
					count[count.length-1]=d;
					d++;
				}
			}
			p++;
			k++;
			r=1;
		}

		for(int i=0; i<count.length; i++){
			if(i<count.length-1){
				System.out.println("Candidate "+(i+1)+" received votes : "+count[i]);
			}
			else{
				System.out.println("Total spoilt ballots are : "+count[i]);
			}
		}

	}
}