class Solution {
    public boolean checkDivisibility(int n) {
        int copy_n=n;
        int dsum=0; int dprod=1;
        while(copy_n > 0){
            dsum += copy_n%10;
            dprod *= copy_n%10;

            copy_n/=10;
        }
         if(n%(dsum+dprod)==0){
               return true;
        }
       
        return false;
    }
}