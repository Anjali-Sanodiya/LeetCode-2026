class Solution {
    public int removeElement(int[] nums, int val) {
        int n= nums.length;
        int i=0, j=0, k=0;
        
        while(i<n){
            if(nums[i]!=val){
                nums[j]=nums[i];
                i++;
                j++;
                k++;
            }
            else{
                i++;
            }
        }
        return k;
    }
}