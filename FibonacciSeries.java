import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number = ");
        int num=sc.nextInt();
        int a=0,b=1;
        System.out.println(a+" ");
        System.out.println(b+" ");
        for(int i=0;i<=num-2;i++)
        {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        sc.close();
    }
}
