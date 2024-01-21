public class Rotatebyone {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        //Approach 1 
        int temp[] = new int[arr.length];
  
        for(int i = 1;i<arr.length;i++)
        {
            temp[i-1] = arr[i];
        }
        temp[arr.length-1] = arr[0];
        for(int i =0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }


        //Aproach - 2
        
        int n = arr.length;
        int temp = arr[0]; // storing the first element of array in a variable
        for (int i = 0; i < n - 1; i++) {
          arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp; // assigned the value of variable at the last index
        for(int i = 0 ;i<n ;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
