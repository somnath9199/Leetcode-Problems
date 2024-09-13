//https://www.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest

class Solution {
    public int print2largest(int[] arr) {
         int max = Integer.MIN_VALUE;
         int SecondMax = Integer.MIN_VALUE;
         for(int i = 0 ; i<arr.length ; i++){
             max = Math.max(max , arr[i]);
         }
         for(int j = 0 ; j<arr.length ; j++){
             if(arr[j]!=max){
                 SecondMax = Math.max(SecondMax , arr[j]);
             }
             
         }
         if( SecondMax == Integer.MIN_VALUE){
             return -1;
         }
        return SecondMax;
    }
}
