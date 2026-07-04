class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;    
        for(int i=0;i<n;i++){
            int counter=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    counter++;
                } 
        }
            if(counter>n/2){
                return nums[i];
          }
        }
        return -1;
    }
}
