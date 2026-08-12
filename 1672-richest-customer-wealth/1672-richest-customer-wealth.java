class Solution {
    public int maximumWealth(int[][] accounts) {
        int n= accounts.length;
        int sum=0, maxWealth=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            maxWealth= Math.max(sum, maxWealth);
            sum=0;
        }
        return maxWealth;
    }
}