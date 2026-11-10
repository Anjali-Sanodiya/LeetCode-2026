class Solution {
    public int maximumProduct(int[] nums) {
        int f = Integer.MIN_VALUE, s = Integer.MIN_VALUE, t = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        
        for (int num : nums) {
            // Track top 3 largest numbers (using >= to allow duplicates)
            if (num >= f) {
                t = s;
                s = f;
                f = num;
            } else if (num >= s) {
                t = s;
                s = num;
            } else if (num >= t) {
                t = num;
            }
            
            // Track 2 smallest numbers for negative pairs
            if (num <= min1) {
                min2 = min1;
                min1 = num;
            } else if (num <= min2) {
                min2 = num;
            }
        }
        
        return Math.max(f * s * t, min1 * min2 * f);
    }
}
