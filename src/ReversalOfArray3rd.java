public class ReversalOfArray3rd {
    public static void main (String [] args)
    {
        int [] array = {10,20,30,40,50};
        int n=array.length;

        for (int i=0;i<n/2;i++)
        {
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
        System.out.println("reversal of array is ");
        for (int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
       
    }
}
