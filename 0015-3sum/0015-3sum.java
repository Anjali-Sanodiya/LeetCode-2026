class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;

        List<List<Integer>> list= new ArrayList<>();

        Arrays.sort(nums);

        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         for(int k=j+1;k<n;k++){
        //             if((nums[i]+nums[j]+nums[k])==0){
        //                 List<Integer> temp=Arrays.asList(nums[i], nums[j], nums[k]);
        //                 if(!list.contains(temp))  list.add(temp);
        //         }  
        //         }
        //     }
        // }


        int i=0; 
        while(i<n-2){

            if(i>0 && nums[i]==nums[i-1]){
                 i++;  
                 continue;
            }

            int j=i+1,k=n-1; int sum=0;

            while(j<k){
                sum=nums[i]+nums[j]+nums[k];

                if(sum<0)  j++;

                else if(sum>0)  k--;

                else{
                  list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                  j++;k--;

                   while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate k
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
               }  
            }
            i++;
         }

        return list;
    }
}
