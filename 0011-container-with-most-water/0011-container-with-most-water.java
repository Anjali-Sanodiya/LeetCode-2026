class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int start=0, end=n-1;  int max_Area=0;
        while(start<end){
                int Area = Math.min(height[start], height[end]) * (end - start); 
                // Here Math.min(height[start], height[end]) used for the height like min(1,7)=1
                // and end- start used for width 8-0=8
                // area= height*width;

                max_Area=Math.max(max_Area,Area);
                if(height[start]<height[end]){
                start++;
            } else{
                end--;
            }
        }
        return max_Area;
    }
}