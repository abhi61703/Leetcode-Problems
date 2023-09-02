class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int a[][] = new int[m][n];
        for(int j=0,k=0;j<n;j++,k++){
            for(int i=m-1,l=0;i>=0;i--,l++){
                a[k][l] = matrix[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=a[i][j];
            }
        }
    }
}
