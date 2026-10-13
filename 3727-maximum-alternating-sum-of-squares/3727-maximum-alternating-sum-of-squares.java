class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n= nums.length;
        long sum1=0, sum2=0;
        
        for(int i=0;i<n;i++){
            nums[i]= Math.abs(nums[i]);
        }
        Arrays.sort(nums);

    
        for(int i=n-1;i>=n/2;i--){
                sum1+=nums[i]*nums[i];
        }
        for(int i=0;i<n/2;i++){
                sum2+=nums[i]*nums[i];
        }
        
        return sum1-sum2;
    }
}