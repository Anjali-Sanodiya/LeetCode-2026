class Solution {
    public boolean isPalindromic(String s) {
        int n=s.length();
        String finalStr="";
       
        for(int i=0;i<n;i++){
            int ch=s.charAt(i);
            String binary="";
            while(ch>0){
              binary=(ch%2)+binary;
              ch/=2;     
            }    
            while(binary.length()<8){
                binary="0"+binary;
            }   
            finalStr+=binary;
        }
        int j=0, k= finalStr.length()-1;

        while(j<k){
            if( finalStr.charAt(j)!= finalStr.charAt(k))  return false;
            j++; k--;
        }
        return true;
    }
}