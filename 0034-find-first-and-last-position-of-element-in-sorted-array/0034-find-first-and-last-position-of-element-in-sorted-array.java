class Solution {

    int upperBound(int arr[],int target){
        int n= arr.length;
        int ans=n;
        int si=0,ei=n-1;

        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]>target){
                ans=mid;
                ei=mid-1;
            } else{
                si=mid+1;
            }
        }
        return ans-1;
    }

    int lowerBound(int arr[],int target){
        int n= arr.length;
        int ans=n;
        int si=0,ei=n-1;

        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]>=target){
                ans=mid;
                ei=mid-1;
            } else{
                si=mid+1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int ans1= lowerBound(nums,target);
        int ans2= upperBound(nums,target); 
        
        if(ans1==n || nums[ans1] != target){
            return new int[] {-1,-1};
        }
        if(ans2==n || nums[ans2] != target){
            return new int[] {-1,-1};
        }
        return new int[] {ans1,ans2};
    }
}