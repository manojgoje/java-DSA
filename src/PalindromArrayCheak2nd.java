public class PalindromArrayCheak2nd {
    public static void main(String[] args){
        int [] array ={10,20,30,20,10};
        int n = array.length;
        int flag = 0;

        for (int i=0;i<n/2;i++)
        {
            if (array[i]!=array[n-i-1])
            {
                flag = 1;
                System.out.println("array is not a pailndrome");
                break;

            }
        }
        if (flag ==0)
        {
            System.out.println("Array is palindrome");
        }


    }
}
