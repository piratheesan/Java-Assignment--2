import java.util.Arrays;
class Q23
{
	public static void main(String args[]){
		String[][] arr={{"srilanaka","31","10-07-2019"},{"india","32","04-07-2019"},{"Chennai","34","02-07-2019"},{"Paris","28","21-07-2019"},{"uk","29","18-07-2019"},{"Adelaide","26","12-07-2019"},{"Perth","35","29-07-2019"},{"london","24","11-07-2019"},{"usa","22","15-07-2019"},{"Christchurch","18","21-07-2019"}};
		String[] city = new String[10];
		int[] tem = new int[10];
		String[] date = new String[10];

		System.out.println("City \t\t\t\t     Temperature \t\t\t    Date");
		for(int p=0; p<10; p++){
			for(int j=0; j<3; j++){
				System.out.print(arr[p][j]+"   \t\t\t\t ");
			}
			System.out.println();
		}

		for(int p=0; p<3; p++){
			for(int j=0; j<10; j++){
				if(p==0){
					city[j]=arr[j][p];
				}
				else if(p==1){
					tem[j]=Integer.parseInt(arr[j][p]);
				}
				else{
					date[j]=arr[j][p];
				}
			}
		}

		int max=Arrays.stream(tem).max().getAsInt();
		int min=Arrays.stream(tem).min().getAsInt();

		for(int p=0; p<tem.length; p++){
			if(tem[p]==max){
				System.out.println("Highest tempreature city is : "+city[p]+" and the date is : "+date[p]);
			}
			else if(tem[p]==min){
				System.out.println("Highest tempreature city is : "+city[p]+" and the date is : "+date[p]);
			}
		}

	}
}