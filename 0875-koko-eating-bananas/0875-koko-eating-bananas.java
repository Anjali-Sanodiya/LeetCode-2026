class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n= piles.length;
        int max= piles[0];
        for(int i=1;i<n;i++){
            max= Math.max(piles[i],max);
        }
        int start=1;
        int end=max;
        
        while(start<=end){
            int mid=start+(end-start)/2;
            long hours=0;

            for(int i=0;i<n;i++){
                hours+=(piles[i]+mid-1)/mid;
        }
            if(hours<=h){
                end=mid-1;     
            }
            else{
                start=mid+1;
            }
         }
        return start;
    }
}