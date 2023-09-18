class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length;
        int column = mat[0].length;
        
        int[] arr = new int[row];
        for(int i=0; i<row; i++)
        {
            int count = 0;
            for(int j=0; j<column; j++)
            {
                if(mat[i][j] == 1)
                {
                    count++;
                }
            }
            arr[i] = count;
        }
        
        int[] res = new int[k];
        for(int i=0; i<k; i++)
        {
            int min = Integer.MAX_VALUE;
            int index = 0;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[j] < min)
                {
                    min = arr[j];
                    index = j;
                }
            }
            res[i] = index;
            arr[index] = Integer.MAX_VALUE;
        }
        return res;
    }
}