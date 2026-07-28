class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int k=1, i=1, j=1;
        while(i<n){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                i++; j++; k++; 
            } else{
                i++;
            }
        }
        return k;
    }
}