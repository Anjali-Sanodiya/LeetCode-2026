class Solution {
    public int maxLength(int[] nums) {
        int n= nums.length;
        int maxLen=0;
        for(int i=0;i<n;i++){
            int prod=1;
            int g=0;
            int l=1;
            for(int j=i;j<n;j++){
                prod*= nums[j];

                g= gcd(g, nums[j]);
                l= lcm(l, nums[j]);

                if(prod== g*l){
                    maxLen= Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;
    }
        int gcd(int a, int b){
            while(b!=0){
                int rem=a%b;
                a=b;
                b=rem;
            }
            return a;
        }

        int lcm(int a, int b){
            return (a/gcd(a,b))*b;
        }
}