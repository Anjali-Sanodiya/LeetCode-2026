class Solution {
    public int maxVowels(String s, int k) {
        int n= s.length();
        int i=0,j=0;
        int count=0, mc=0;

        while(j<n){
            char ch = s.charAt(j);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            count++;
        }

            if(j-i+1==k){
                mc= Math.max(count,mc);
                
                char ch2 = s.charAt(i);
                if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u')  count--;
                i++;
            } 
            j++;
        }
        return mc;
    }
}