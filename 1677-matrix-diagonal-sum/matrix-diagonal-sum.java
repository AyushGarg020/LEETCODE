class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i =0;i<n;i++){
            sum = sum + mat[i][i];
            if(i != n-1-i){
                sum = sum +mat[i][n-1-i];
            }
        }
        return sum;
    }
}
/*
class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length-1;
        int sum = 0;
        for(int i=0; i<=len; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if(i==j || i+j==len) {
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}
*/