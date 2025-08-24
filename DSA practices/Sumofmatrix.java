import java.util.*;
 class Sumofmatrix{
   static void printmatrix(int arr[][],int rows,int cols){
      for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          System.out.print(arr[i][j]+" ");
   }
    System.out.println("");
  }}

  static void sumMatrix(int a[][],int r1,int c1,int b[][],int r2,int c2){
             if(r1 != r2|| c1 !=c2){
                return;
             }
             int sum[][] = new int[r1][c1];
             for(int i=0;i<r1;i++){
             for(int j=0;j<c1;j++){
             sum[i][j] = a[i][j] + b[i][j];
        }
      }
         System.out.println("sum of array is");
             for(int i=0;i<r1;i++){
             for(int j=0;j<c1;j++){
             System.out.print(sum[i][j]+" ");
             }
             System.out.println("");
            }
  }

    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int r1,r2,c1,c2;

      System.out.println("enter row and columns as inputs for first array ");
      r1  = sc.nextInt();
      c1  = sc.nextInt();
      int a[][] = new int[r1][c1];
      for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            a[i][j] = sc.nextInt();
        }
      }
        

      System.out.println("enter row and columns as inputs for second array ");
      r2  = sc.nextInt();
      c2  = sc.nextInt();
      int b[][] = new int[r2][c2];
      for(int i=0;i<r2;i++){
        for(int j=0;j<c2;j++){
            b[i][j] = sc.nextInt();
        }
      }
       System.out.println("first array is");
        printmatrix(a,r1,c1);
        System.out.println("second array is");
        printmatrix(b,r2,c2);
        sumMatrix(a,r1,c1,b,r2,c2);
            
      
    }
}
