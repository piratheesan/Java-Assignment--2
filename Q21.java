public class Q21{
   int size = 50 ;            
   int m = 1;
   int c = -10;
   int y = m*size + c ;        

   String[][] Matrix(){
       String[][] a = new String[size][y];
       for (int i = 0; i < size; i++) {
           for (int j = 0; j < y; j++) {
               if(i == m*j + c){
                   if(i>=0 && j>=0) a[i][j] = "**";
               }
               else{
                   if(i>=0 && j>=0) a[i][j] = " 0";
               }  
           }
       }
       return a;
   }
   void printMatrix(String[][] a){
       for (int i = size-1; i >= 0; i--) {
           for (int j = 0; j < y; j++) {
               System.out.print(a[i][j]);
           }
           System.out.println();
       }
   }
   public static void main(String[] args) {
       Q21 l = new Q21();
       l.printMatrix(l.Matrix());
   }
}