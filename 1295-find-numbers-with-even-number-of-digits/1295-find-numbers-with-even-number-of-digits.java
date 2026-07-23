class Solution {
    public int findNumbers(int[] nums) {
        int n= nums.length;
        int count=0;
        int digit=0;
        int countEven=0; 
        for(int i=0;i<n;i++){
            digit=nums[i];
            while(digit>0){
            digit/=10;
            count++;
            }
            if(count%2==0){
                countEven++;
            }
            count=0;
        }
       return countEven;
    }
}