public class maxconsecutive {
    public static void main(String args[])
    {
        int arr[]= {1, 1, 0, 1, 1, 1};
        int count = 0 ;
        int Maximum =0;
     for(int i = 0 ;i < arr.length; i++)
     {
       if(arr[i]==1)
       {
        count++;
       }
       else{
        count = 0; 
       }
       Maximum = Math.max(Maximum, count);
     }
     System.out.println(Maximum);
    }
}
