class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int counter=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                counter++;
                ans= Math.max(counter,ans);
            } else{
                counter=0;
            }
        }
        return ans;
    }
}