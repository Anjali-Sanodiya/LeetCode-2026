class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int j= target-nums[i];
            if(map.containsKey(j) && i!=map.get(j)){
                return new int[]{i, map.get(j)};
            }
        }
        return new int [] {-1,-1};
    }
}