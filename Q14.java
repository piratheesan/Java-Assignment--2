public class Q14 
{
    public static void main(String[] args) {
        double a = 4, b = 4, c = 6;
        double root, root1;
        double determinant = b * b - 4 * a * c;
        
        if(determinant > 0) 
		{
            root = (-b + Math.sqrt(determinant)) / (2 * a);
            root1 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("root1 = %.2f and root2 = %.2f", root , root1);
        }
        
        else if(determinant == 0) 
		{
            root = root1 = -b / (2 * a);
            System.out.format("root = root1 = %.2f;", root);
        }
       
        else 
		{
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root = %.2f+%.2fi & root1 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}