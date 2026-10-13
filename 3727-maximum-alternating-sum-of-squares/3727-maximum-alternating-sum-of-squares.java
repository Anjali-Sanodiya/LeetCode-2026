class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n= nums.length;
        long sum1=0, sum2=0;
        long ans=0;
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= Math.abs(nums[i]);
        }
        Arrays.sort(arr);
         if(n%2==0){
            for(int i=n-1;i>=n/2;i--){
                sum1+=arr[i]*arr[i];
            }
            for(int i=0;i<n/2;i++){
                sum2+=arr[i]*arr[i];
            }
            ans= sum1-sum2;
         }
         else{
            for(int i=n-1;i>=n/2;i--){
                sum1+=arr[i]*arr[i];
            }
            for(int i=0;i<n/2;i++){
                sum2+=arr[i]*arr[i];
            }
            ans=sum1-sum2;
         }
         return ans;
    }
}