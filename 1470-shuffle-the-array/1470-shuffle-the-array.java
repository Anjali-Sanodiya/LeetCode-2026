class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m=nums.length;
        int al=2*n;
        int[] ans= new int[al];
        int i=0,j=n;
        while(i<n){
            ans[i*2]=nums[i];
            ans[2*i+1]=nums[j];
            i++; j++;
        }
        return ans;
    }
}