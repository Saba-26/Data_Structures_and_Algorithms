import java.util.*;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rows=2*num-1;
        for(int i=1;i<=rows;i++){
            if(i<=num)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                for(int k=1;k<=rows-i+1;k++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
