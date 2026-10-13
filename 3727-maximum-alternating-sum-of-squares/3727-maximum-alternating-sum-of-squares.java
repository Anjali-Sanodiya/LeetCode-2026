class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n= nums.length;
        long sum1=0, sum2=0;
        long ans=0;
        
        for(int i=0;i<n;i++){
            nums[i]= Math.abs(nums[i]);
        }
        Arrays.sort(nums);

         if(n%2==0){
            for(int i=n-1;i>=n/2;i--){
                sum1+=nums[i]*nums[i];
            }
            for(int i=0;i<n/2;i++){
                sum2+=nums[i]*nums[i];
            }
            ans= sum1-sum2;
         }
         else{
            for(int i=n-1;i>=n/2;i--){
                sum1+=nums[i]*nums[i];
            }
            for(int i=0;i<n/2;i++){
                sum2+=nums[i]*nums[i];
            }
            ans=sum1-sum2;
         }
         return ans;
    }
}