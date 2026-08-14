class Solution {
    public int findNumbers(int[] nums) {
        int dcount=0, evenCount=0;

        for(int num:nums){
            while(num>0){
                dcount++;
                num/=10;
            }
            if(dcount%2==0){
                evenCount++;
            }
            dcount=0;
        }
        return evenCount;
    }
}