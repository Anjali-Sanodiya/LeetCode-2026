class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0, right = n-1;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == nums[mid + 1]){
                mid = mid-1;
            }

            int leftPartLen= mid - left + 1;
            if(leftPartLen % 2 != 0){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return nums[left];
    }
}


// USING BRUTE-FORCE

// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         int n= nums.length;
//         if(n==1) return nums[0];
//         if(nums[0]!=nums[1])  return nums[0];
//         if(nums[n-1]!=nums[n-2]) return nums[n-1];

//         for(int i=1;i<n-1;i++){
//             if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }