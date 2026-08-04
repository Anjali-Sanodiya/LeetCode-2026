class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n= blocks.length();
        int counter=0;
        int ans= Integer.MAX_VALUE;
        int i=0,j=0;
        while(j<n){
            char ch= blocks.charAt(j);
            if(ch=='W') counter++;

            while(j-i+1==k){
                ans=Math.min(ans,counter);
                char ch2=blocks.charAt(i);
                if(ch2=='W') counter--;
                i++;
            }
            j++;
        }
        return ans;
    }
}