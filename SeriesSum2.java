import java.util.*;

public class SeriesSum2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number = ");
        int num=sc.nextInt();
        float res=0;
        for(float i=1;i<=num;i++)
        {
            if(num%2==0)
            {
                res-=1/i;
            }
            else{
                res+=1/i;
            }
            
        }
        System.out.println(res);
        sc.close();
    }
}
