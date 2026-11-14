class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n= nums.size();
        
        int ans= Integer.MAX_VALUE;

        for(int len= l; len<=r; len++){
            int i=0, j=0;
            int sum=0;
            while(j<n){
                sum += nums.get(j);
                while(j-i+1==len){
                    if(sum > 0)  ans= Math.min(ans, sum);
                    sum-= nums.get(i);
                    i++;
                }
                j++;
        }
    }
        return ans == Integer.MAX_VALUE ? -1 : ans;

    }
}