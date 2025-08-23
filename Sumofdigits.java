import java.util.Scanner;

public class Sumofdigits {
   public sumofdigits() {
   }

   static int sumofdigit(int var0) {
      return var0 == 0 ? var0 : var0 % 10 + sumofdigit(var0 / 10);
   }

   public static void main(String[] var0) {
      System.out.println("enter value of n");
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      System.out.println(sumofdigit(var2));
   }
}
