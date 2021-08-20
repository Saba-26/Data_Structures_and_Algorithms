import java.util.Scanner;

public class Patter4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1-i;j<=num;j++)
            {
                System.out.print("  ");
            }

            for(int k=1;k<=i;k++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
