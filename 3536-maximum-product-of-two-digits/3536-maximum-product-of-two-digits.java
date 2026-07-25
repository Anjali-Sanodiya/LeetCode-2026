class Solution {
    public int maxProduct(int n) {
        int newNum=n;
        int count=0, prod=0, ans=0;
        while(newNum>0){
            newNum/=10;
            count++;
        }
        int[] arr= new int[count];
        for(int i=count-1;i>=0;i--){
            arr[i]=n%10;
            n/=10;
        }
        for(int i=0;i<count;i++){
            for(int j=i+1;j<count;j++){
                prod=arr[i]*arr[j];
                ans= Math.max(ans,prod);
            }
        }
        return ans;
    }
}