class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1, j=1;
        int n=nums.length;
        while(i<n){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}