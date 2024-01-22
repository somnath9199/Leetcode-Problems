import java.util.ArrayList;

public class removezero {
    public static void RemoveZerosBruteforce(int arr[]){
        ArrayList<Integer> temp  = new ArrayList<>();
        for(int i =0 ; i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                temp.add(arr[i]);
            }
        }  
        for(int i = temp.size() ; i<arr.length;i++)
        {
            temp.add(0);
        }
        for(int i = 0 ;i<temp.size();i++)
        {
            System.out.print(temp.get(i)+ " ");
        }
    }

    public static void RemoveZerosoptimized(int arr[])
    {
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        //no non-zero elements:
   

        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }
       for(int i =0 ;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,0,3,4,0,0,0, 5,7};
        System.out.println("Before");
        for(int i =0 ;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
   
    }
}
