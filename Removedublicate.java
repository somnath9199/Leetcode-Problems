//Brute force approach 

public class Removedublicate { 
        public static int removeDuplicates(int[] nums) {
          HashSet <Integer > set = new HashSet<>();
          for(int i=0;i<nums.length;i++)
          {
            set.add(nums[i]);
          }
          int k = set.size();
          int j = 0 ;
          for (int x: set) {
            nums[j++] = x;
        }
        return k;
        
        }

        
//optimal Approach

public class Removedublicate { 
        public int removeDuplicates(int[] nums) {
          int j = 1;
          for(int i = 1 ;i <nums.length ;i++)
          {
              if(nums[i]!= nums[i-1])
              {
                  nums[j] = nums[i];
                  j++;
              }
          }
          return j ; 
        }
    }


