package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class ThreeSum {
    public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<ArrayList<Integer>> list=new HashSet<>();

        for(int i=0;i<nums.length-2;i++){ //Doing length-2, because we want two values after first element
            
            int left=i+1;
            int right=nums.length-1;
          while(left<right){
              int sum=nums[i]+nums[left]+nums[right];
              if(sum==0){
                  list.add((ArrayList<Integer>) Arrays.asList(nums[i], nums[left], nums[right]));
                  left++;
                  right--;
              }
              else if(sum > 0){
                right--;
              }
             else if(sum<0){
                 left++;
             }
          }

        }

        return new ArrayList<>(list);
    }
} 







