class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        int i=0, j=0;

        while(i<n){
            if(nums[i]!=0){
                nums[j]=nums[i];
                i++; j++;
            } else{
                i++;
            }
        }
        for(int k=j;k<n;k++){
            nums[k]=0;
        }
    }
}