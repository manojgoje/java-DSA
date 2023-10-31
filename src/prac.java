import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter The Size Of an array");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter The Array Element here");
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//
//        }
//
//        System.out.println("Printing array Elemnt ");
//        for (int j=0;j<size;j++)
//        {
//            System.out.println(arr[j]);
//        }
//
//        System.out.println("acces the value of any index enter index here");
//        int index = sc.nextInt();
//        System.out.println(arr[index]);

        System.out.println("The Program of reversal of an arrray");

        System.out.println("Enter The Size Of an array");
        int sizee = sc.nextInt();
        int[] arrr= new int[sizee];
        System.out.println("Enter The Array Element here");
        for (int i = 0; i < sizee; i++)
        {
            arrr[i] = sc.nextInt();
        }
        for (int i=0;i<sizee/2;i++)
        {
        int temp = arrr[i];
        arrr[i] = arrr[sizee/2-i];
        arrr [sizee/2-i] = temp;

        }

        System.out.println("reersal of array is ");
        for (int i=0;i<sizee;i++)
        {
            System.out.println(arrr[i]);
        }

    }



}
