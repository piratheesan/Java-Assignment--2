public class Q13
{

    public static void main(String[] args) 
	{
        double [] db = {3, 8, 13, 18, 16, 6, 4, 15, 21};
        int num = db.length;
        double sum =0;
        for (int i = 0; i < num; i++) {
            sum += db[i];
        }
        double avg = sum / num;
        double sum2 = 0;
        for (int i = 0; i < num; i++) {
            sum2 += Math.pow((db[i]-avg),2);
        }
        double sd = Math.sqrt(sum2/num);
        System.out.println(sd);

    }
    
}