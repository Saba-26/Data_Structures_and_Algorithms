import java.util.*;

public class Pattern7 {
    public static void main(String[] args) {
       Scanner sc=new Scanner("System.in");
       int num=sc.nextInt();
       System.out.println("* ");
       for(int i=2;i<=num-1;i++)
       {
           System.out.println("* ");

           for(int j=1;j<=i-2;j++)
           {
               System.out.println("  ");
           }
           System.out.println("* ");
           System.out.println();
       } 
       if(num>1){
           for(int k=1;k<=num;k++){
               System.out.print("*  ");
           }

       }
       sc.close();
    }
}
