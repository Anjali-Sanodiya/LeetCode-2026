class Solution {
    public int numOfSubarrays(int[] arr, int k, int thr) {
       int i=0, j=0, n=arr.length, count=0, sum=0;

       // Creation of a sliding Window
       while(j<n){
        sum+=arr[j];

        while(j-i+1==k){
            if(sum/k>=thr){
                count++;
            }
            sum-=arr[i];
            i++;
        }
        j++;
       }
       return count;
    }
}