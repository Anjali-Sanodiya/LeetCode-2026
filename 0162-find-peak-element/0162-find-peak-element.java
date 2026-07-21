class Solution {
    public int findPeakElement(int[] nums) {
       int n=nums.length;
       int si=1, ei=n-2;
       if(n==1)  return 0;
       if (nums[0] > nums[1]) return 0;
       if (nums[n - 1] > nums[n - 2])  return n - 1;
       while(si<=ei){
         int mid= si+(ei-si)/2;
         if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])  return mid;
   
   // Pointer updation
         if(nums[mid]<nums[mid-1]){
         ei=mid-1;
        } else{
        si=mid+1;
      }
    }
      return -1;
    }
}