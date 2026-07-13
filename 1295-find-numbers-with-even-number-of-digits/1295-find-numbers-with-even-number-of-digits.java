class Solution {
    public boolean countDigit(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
    public int findNumbers(int[] nums) {
        int evenCount=0;
        for(int num: nums){
           if(countDigit(num)){
            evenCount++;
           }
        }  
        return evenCount;
    }
}