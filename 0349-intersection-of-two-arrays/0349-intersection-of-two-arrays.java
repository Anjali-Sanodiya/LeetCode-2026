class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int n2=nums2.length;
        HashSet<Integer> st= new HashSet<>();
        ArrayList<Integer> list= new ArrayList<>();

        for(int i=0;i<n;i++){
            st.add(nums1[i]);
        }
        for(int i=0;i<n2;i++){
            if(st.contains(nums2[i])){
                list.add(nums2[i]);
                st.remove(nums2[i]); 
            }
        }
        
        int[] ans= new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]= list.get(i);
        }
        return ans;
    }
}