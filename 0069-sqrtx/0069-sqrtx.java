class Solution {
    public int mySqrt(int x) {
        long i=0;
        if(x<2)  return x;
        while(i*i<=x){
            i++;
        }
        return (int) (i-1);
    }
}