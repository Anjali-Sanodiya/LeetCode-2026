class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        int counter=0;
        int candidate=0;
        for(int i=0;i<n;i++){
            if(counter==0){
                candidate=nums[i];
            }
            if(nums[i]== candidate){
                counter++;
            }
            else{
                counter--;
            }
        }
        return candidate;
    }
}