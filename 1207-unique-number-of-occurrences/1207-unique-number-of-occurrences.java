class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> set= new HashSet<>();

        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            set.add(map.get(arr[i]));
        }
        for(int i=0;i<n;i++){
            if(map.size()==set.size()){
                return true;
            }
        }
        return false;
    }
}