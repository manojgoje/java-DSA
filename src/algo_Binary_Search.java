import java.util.Scanner;

public class algo_Binary_Search {

    public static int binarySerach(int[] arr,int target)
    {
         int low = 0; int high = arr.length-1;
        while (low<high)
        {
           int mid =low +high/2;

           if (arr[mid] == target)
           {
               return mid;
           } else if (arr[mid]<target)
           {
               low = mid +1;
           }
           else {
               high =mid-1;
           }
        }
        return 0;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of an array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter The Array Elemnt here ");
        for (int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter The Target Element here");
        int target = sc.nextInt();
        int result = binarySerach(arr,target);
        if (result == 0)
        {
            System.out.println("Searched Inex Was Not Found.....! ");
        }
        else {
            System.out.println("target Element found At the index :-"+ result);
        }

    }

}
