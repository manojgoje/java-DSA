import java.util.Scanner;

class main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of the element here :-");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter The array elemnt you want");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();

        }
        System.out.println("if you want to print array element here then press 'Y' otherwise 'N' ");

        String ans = sc.nextLine();

        switch (ans)
        {
            case "Y": for (int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
            case "N": break;

        }

        System.out.println("Enter The Targeted Element here ");
        int target = sc.nextInt();
        int index =0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] == target)
            {
                System.out.println("Targetted Elemnt found at the index "+ i);
                index = 1;

            }
        }
        if (index ==0)
        {
            System.out.println("Targeetd Elemnt not present in the Array");
        }


    }
}