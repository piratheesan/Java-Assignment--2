class Q20
{
	public static void main(String args[]){
		String[][] arr={{"*"," "," "," "," "},{"*"," "," "," "," "},{"*"," "," "," "," "},{"*"," "," "," "," "},{"*","*","*","*","*"}};

		for(int a=0; a<arr.length; a++){
			for(int j=0; j<arr.length; j++){
				System.out.print(arr[a][j]+" ");
			}
			System.out.println();
		}

		for(int a=0; a<arr.length; a++){
			for(int j=1; j<arr.length; j++){
				if(a==0){
					arr[a][j]="*";
				}
				else if(a==4){
					arr[a][j]=" ";
				}
			}
		}

		for(int a=0; a<arr.length; a++){
			for(int j=0; j<arr.length; j++){
				System.out.print(arr[a][j]+" ");
			}
			System.out.println();
		}

	}
}