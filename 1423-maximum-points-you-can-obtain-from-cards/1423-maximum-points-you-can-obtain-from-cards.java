class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n= cardPoints.length;
        int ts=0;

        for(int i=0;i<n;i++){
            ts+=cardPoints[i];
        }

        if(k == n)    return ts;
        
        int i=0, j=0;
        int minWinSum=Integer.MAX_VALUE;
        int ws=0;
        while(j<n){
            ws += cardPoints[j];
            if(j-i+1==n-k){
                minWinSum= Math.min(minWinSum, ws);
                ws-=cardPoints[i];
                i++;
            }
           j++; 
        }

        return ts- minWinSum;
    }
}