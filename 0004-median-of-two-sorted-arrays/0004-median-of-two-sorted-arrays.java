class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m= nums1.length;
        int n= nums2.length;
        int l=m+n;
        
        int arr[] = new int[l];
        
        int i=0, j=0,k=0;

        while(i<m && j<n){
            if(nums1[i]< nums2[j]){
                arr[k]= nums1[i];
                i++; k++;
            }
            else{
                arr[k]= nums2[j];
                j++; k++;
            }
        }

        while(i<m)  arr[k++]= nums1[i++];
        while(j<n)  arr[k++]= nums2[j++];

        double sum=0;

        if(l % 2 == 0){
            int mid1 = l/2-1;
            int mid2= l/2;
            return (arr[mid1]+ arr[mid2]) /2.0;
        }
        else{
            return arr[l/2];
        }

    }
}