class Solution {
    public int countRotations(String s, int k) {
        int m= s.length();
        String str = s+s;
        int n = str.length();
        int counter=0;
        

        for(int i=0;i<n-m;i++){
           int score=0;
           String substr= str.substring(i,i+m);

           for(int j=0;j<m-1;j++){
              if(substr.charAt(j) == substr.charAt(j+1))      score++;  
        }
           if(score==k)   counter++;
    }   
        return counter;
    }
}