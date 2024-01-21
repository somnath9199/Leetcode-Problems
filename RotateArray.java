class Solution {
    public void rotate(int[] nums, int k) {
        int temp[] = new int[nums.length];

        for(int i = 0 ; i< temp.length ;i++)
        {
            temp[(i+k)%temp.length]= nums[i];
        }
      for(int i=0;i<nums.length;i++)
      {
          nums[i] = temp[i];
      }
    }
}