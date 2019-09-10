public class Q3 {

    public static void main(String[] args) {

        int i = 1;
        int m = 8;
        int t1=0, t2=1;
        
        do{
            int sum = t1+t2;
            t1=t2;
            t2=sum;
            i++;
            
            System.out.print(t1 + ",");   
        }while(i<=m);
    }

}