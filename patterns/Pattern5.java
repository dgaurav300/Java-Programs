package patterns;
/*
     *
    * *
   * * *
  * * * *
 * * * * *
 
 
 */
public class Pattern5 {
    public static void main(String[] args) {
        int row=8;
        for(int i=1;i<=row;i++)
        {
            for(int space=row-1;space>=i;space--)
            {
                System.out.print("\s");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            
            System.out.println();

        }
    }
}
