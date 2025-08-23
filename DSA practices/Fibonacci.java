import java.util.Scanner;

public class Fibonacci {

    static int fibo(int n){
        if(n<=1){
        return n;
        }
         return fibo(n-1) + fibo(n-2);
    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Enter fibonacci number of "+n+" term");
        System.out.println(fibo(n));
    
    }
}
