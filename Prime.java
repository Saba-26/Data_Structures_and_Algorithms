import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter number = ");
        int num=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                isPrime=false;
            }
        }
        if(isPrime==false){
            System.out.println(num+" = is not a prime number");
        }
        else{
            System.out.println(num+" = is a prime number");
        }
        sc.close();
    }
}
