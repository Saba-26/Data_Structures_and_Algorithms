import java.util.*;

public class SeriesSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number = ");
        int num=sc.nextInt();
        float res=0;
        for(float i=0;i<=num;i++)
        {
            res=1/i;
        }
        System.out.println(res);
        sc.close();
    }
}
