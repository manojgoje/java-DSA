import java.util.Scanner;

public class algo_Linear_Search {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        // getting size of element from user
        System.out.println("enter The Size of an element here ");
        size = sc.nextInt();
        // geeting array elemnet here enterd from the user
        int [] arr = new int[size];

        for (int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();

        }
        // target element form the user
        System.out.println("Enter The Target Element here ");
        int target = sc.nextInt();

        // implimentation of linear search
        int index =-1;
        for (int i=0;i<size;i++)
        {
            if (arr[i]==target)
            {
                index = i;
            }

        }
        if (index == -1)
        {
            System.out.println("Enterd targetted Element is does not found");
        }
        else
        {
            System.out.println("argetted array element found on at index : "+ index);
        }



    }
}
