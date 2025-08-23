import java.util.Scanner;
public class Factorial {
    static int facto(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*facto(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        sc.close();
        int result=facto(n);
        System.out.println(result);

    }
}
