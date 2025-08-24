import java.util.*;
 class transposeofmatrix{
   static void printmatrix(int arr[][],int rows,int cols){
    System.out.println("your matrix is :");
      for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          System.out.print(arr[i][j]+" ");
   }
    System.out.println("");
  }}
  
  static void printtransposematrix(int arr[][],int rows,int cols){
    int transpose[][]=new int[cols][rows];
    System.out.println("transpose of matrix is :");
      for(int i=0;i<cols;i++){
        for(int j=0;j<rows;j++){
            transpose[i][j]=arr[j][i];
          System.out.print(transpose[i][j]+" ");
         
   }

    System.out.println("");
  }}
  
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int r1,c1;

      System.out.println("enter inputs for first array ");
      r1  = sc.nextInt();
      c1  = sc.nextInt();
      int a[][] = new int[r1][c1];
      for(int i=0;i<r1;i++){
        for(int j=0;j<c1;j++){
            a[i][j] = sc.nextInt();
        }
      }
      printmatrix(a,r1,c1);
      printtransposematrix(a,r1,c1);
      

      
    }
}
