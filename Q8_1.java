//import java.util.Arrays;


public class Q8_1 {

    public static void main(String[] args) {

        String word = "apple,orange,strawberry,banana,";

        String[] values = word.split(",");

        //System.out.println(Arrays.toString(values));
		
		for(int i=0; i<values.length;i++)
		{
			 System.out.println(values[i]);
		}
    }
}

