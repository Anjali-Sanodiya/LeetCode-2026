class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int answer[]= new int[n];
        int pa[]=new int[n];
        int sa[]=new int[n];

        pa[0]=1; sa[n-1]=1;
        for(int i=1;i<n;i++){
            pa[i]=pa[i-1]*nums[i-1];
        }
        for(int j=n-2;j>=0;j--){
            sa[j]=sa[j+1]*nums[j+1];
        }
        for(int i=0;i<n;i++){
            answer[i]=pa[i]*sa[i];
        }
        return answer;
    }
}