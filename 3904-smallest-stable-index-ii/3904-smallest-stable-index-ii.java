class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int p[] = new int[n];
        int s[]= new int[n];
    
        if (n <= 1) return 0;         //This condition checks if the n is greater than or equal to 1 if it is true then return 0
        
        p[0]=nums[0];                          // This condition assign the value of nums[0] to p[0]
        for(int i=1;i<n;i++){                 // This loop assign values to the   p[] = [5,5,5,5]
            p[i]= Math.max(p[i-1],nums[i]);
        }

        s[n-1]= nums[n-1];
        for(int i=n-2;i>=0;i--){               // This for loop assign the min values from n-1 to i int the s[] = [0,0,1,4]
            s[i]= Math.min(s[i+1],nums[i]);
        }

        for(int i=0;i<n;i++){                   //This loop takes the values of p[] and s[]  to check the smallest stable index
            if(p[i]-s[i] <= k)     return i;
        }
    
        return -1;
    }
}