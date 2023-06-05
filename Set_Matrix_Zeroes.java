class Solution {
    public static void removeRow(int i,int n,int[][] matrix){
        for(int j=0;j<n;j++){
            if(matrix[i][j]!=0){
                matrix[i][j]=-1;
            }
        }
    }
    public static void removeCol(int i,int m,int[][] matrix){
        for(int j=0;j<m;j++){
            if(matrix[j][i]!=0){
                matrix[j][i]=-1;
            }
        }
    }

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    removeRow(i,n,matrix);
                    removeCol(j,m,matrix);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
