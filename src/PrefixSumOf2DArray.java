
import java.util.Scanner;

public class PrefixSumOf2DArray {

    public static int findSumMatrix(int[][]arr,int r1,int c1,int r2,int c2)
    {
        //step 1
        int sum=0;
        for (int i=r1;i<=r2;i++){
            for (int j=c1;j<=c2;j++)
            {
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The row of an array");
        int row = sc.nextInt();

        System.out.println("Enter The col of an array");
        int col = sc.nextInt();

        int [][] arr = new int[row][col];

        System.out.println("Enter The Element Of The Array");
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter The Co-Ordinate of r1");
        int r1 = sc.nextInt();
        System.out.println("Enter The Co-Ordinate of c1");
        int c1 = sc.nextInt();
        System.out.println("Enter The Co-Ordinate of r2");
        int r2 = sc.nextInt();
        System.out.println("Enter The Co-Ordinate of c2");
        int c2 = sc.nextInt();
        int result = findSumMatrix(arr,r1,c1,r2,c2);
        System.out.println("The find sum matrix is "+ result);



   }
}
