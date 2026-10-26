class Solution {
    public double trimMean(int[] arr) {
        int n= arr.length;
        double sum=0.0;
        Arrays.sort(arr);

        int removeCount= (n*5)/100;
        for(int i=removeCount; i< n- removeCount; i++){
            sum+= arr[i];
        }
        int tre = n-removeCount*2;
        return sum/ tre;
    }
}