class Solution {
    public boolean isPalindrome(String s) {
        int n= s.length();

        StringBuilder sb= new StringBuilder();

        for(int i=0;i<n;i++){
            char ch= Character.toLowerCase(s.charAt(i));
            if(Character.isLetterOrDigit(ch))  sb.append(ch);    
        }
        
        int i=0, j=sb.length()-1;

        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j))  
            return false;
            i++;j--;
        }
        return true;
    }
}