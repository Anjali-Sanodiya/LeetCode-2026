class Solution {
    public int minimizeSum(int[] nums) {
        int n= nums.length;

        Arrays.sort(nums);

        int score1= nums[n-1]- nums[2];
        int score2= nums[n-3]-nums[0];
        int score3= nums[n-2]-nums[1];

        return Math.min(score1, Math.min(score2, score3));
       
    }
}