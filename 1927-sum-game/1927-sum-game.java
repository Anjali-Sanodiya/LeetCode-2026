class Solution {

     public int sum(int i,int j,String num){                       //Calculate the sum of known digits on both sides.
        int sum=0;
       while(i<j){
        char ch= num.charAt(i);
        int digit= ch-'0';
        if(ch!='?')   sum+=digit;
            i++;
        }
        return sum;
    }

    public int count(int i,int j,String num){                     //Count ? on both sides.
        int counter=0;
        while(i<j){
            if(num.charAt(i)=='?')  counter++;
            i++;
        }
        return counter;
    }

    public boolean sumGame(String num) {
        int n= num.length();

        int left_sum=sum(0,n/2,num);
        int right_sum=sum(n/2,n,num);
        
        int left_count=count(0,n/2,num);
        int right_count=count(n/2,n,num);

        if((left_count + right_count) %2 == 1 )     return true;                    //If total ? count is odd → Alice wins.

        if((left_sum - right_sum) != 9* (right_count - left_count )/2 )     return true;    //Otherwise, compare the known-sum difference with the maximum compensation possible from the difference in ? counts.
        
       
        return false;
    }
}