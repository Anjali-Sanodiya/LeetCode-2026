class NumArray {
    int nums[];
    int prefix[];
    public NumArray(int[] nums) {
        this.nums=nums;
        prefix= nums;
        int n= prefix.length;
        int preSum=0;
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){                              //   this loop calulate the prefix sum 
            preSum=nums[i]+prefix[i-1];
            prefix[i]=preSum;
        }
        
    }
    
    public int sumRange(int left, int right) {

        if(left==0){                                    // these conditions check and return the prefix sum
            return prefix[right];
        }

        return prefix[right]-prefix[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */