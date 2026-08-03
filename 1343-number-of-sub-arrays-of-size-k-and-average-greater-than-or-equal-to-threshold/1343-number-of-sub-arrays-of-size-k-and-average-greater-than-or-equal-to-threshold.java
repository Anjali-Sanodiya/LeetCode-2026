class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length, counter=0,i=0,j=0, sum=0;
        int rs=k*threshold;

        while(j<n){
            sum+=arr[j];
            while(j-i+1==k){
                if(sum>=rs){
                    counter++;
                }
                sum-=arr[i];
                i++;
            }
            j++;
        }
        return counter;
    }
}