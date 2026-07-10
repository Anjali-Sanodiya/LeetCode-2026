class Solution {
    public void rotate(int[] nums, int k) {
       int i=0;
       int n=nums.length;
       k=k%n;
       reverseNums(i,n-1,nums);
       reverseNums(i,k-1,nums);
       reverseNums(k,n-1,nums);
       
    }

    void reverseNums(int start, int end,int[] nums){ 
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++; end--;
        }
    }
}