class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int m=2*n;
        int[] ans= new int[m];
    for(int i=0;i<n;i++){
        for(int j=i+n;j<m;j++){
            ans[i]=nums[i];
            ans[j]=nums[i];
        }
    }
        return ans;
    }
}