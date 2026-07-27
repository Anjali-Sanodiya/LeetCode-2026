class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        int p1= (nums[n-1]-1)*(nums[n-2]-1);
        int p2= (nums[0]-1)*(nums[n-2]-1);
        ans= Math.max(p1,p2);
        return ans;
    }
}