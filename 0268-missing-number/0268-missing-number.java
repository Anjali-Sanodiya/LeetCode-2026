class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);

        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0;
        while(i<n){
            map.put(nums[i],i);
            i++;
        }
        for(int j=0;j<=n;j++){
            if(!map.containsKey(j)){  
                return j;
            } 
        }
        return -1;
    }
}