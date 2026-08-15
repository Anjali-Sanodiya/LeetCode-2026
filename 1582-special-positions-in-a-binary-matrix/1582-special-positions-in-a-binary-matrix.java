class Solution {
    public int numSpecial(int[][] mat) {
        int n= mat.length;
        int counter=0;

// Intution:- pick an element and check if it is 1 or not. if yes then check the another one on that same row and column
// These first two for loops are used to iterate through the elements of the matrix
        for(int i=0;i<n;i++){
            int m=mat[i].length;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    int row=0,col=0;
                    for(int k=0;k<m;k++){       // here k is a column that checks the value of an element for the fixed i

                        if(mat[i][k]==1)  row++;
                    }

                    for(int k=0;k<n;k++){      // here k acts as row that check the element value for the fixed value of j
                        if(mat[k][j]==1)  col++;
                    }
                    if(row==1 && col==1)  counter++;
                }
            }
        }
        return counter;
    }
}