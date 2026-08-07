class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int i=0, j=0;
        double cs=0;
        double ms= Integer.MIN_VALUE;

        if(n==1) return nums[0];
       

        while(j<n){
            cs+=nums[j];

            while(j-i+1==k){
                ms=Math.max(cs,ms);
                cs-=nums[i];
                i++;
            }
            j++;
        }
        return ms/k;
    }
}