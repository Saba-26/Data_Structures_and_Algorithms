import java.util.*;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int number=1;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num-i;j++)
            {
                System.out.print("  ");
            }

            for(int k=1;k<=i;k++)
            {
                System.out.print(number++ +"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
