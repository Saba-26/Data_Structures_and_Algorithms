import java.util.*;

public class PowerEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number1 = ");
        int num1=sc.nextInt();
        System.out.print("Enter number2 = ");
        int num2=sc.nextInt();
        int result=1;
        for(int i=0;i<num2;i++)
        {
            result=result*num1;
        }
        System.out.println(result);
        sc.close();
    }
}
