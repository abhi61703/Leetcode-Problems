class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> colors = new HashMap<>();
        HashMap<Integer,Integer> ballMap = new HashMap<>();
        int result[] = new int[queries.length];
        for(int i =0;i<queries.length;i++){
            int ball = queries[i][0];
            int color = queries[i][1];

            
            if(ballMap.get(ball) != null){
                int prev = ballMap.get(ball);
                colors.put(prev,colors.get(prev)-1);
                 
                 if(colors.get(prev) == 0)
                   colors.remove(prev);
            }

            ballMap.put(ball,color);
            colors.put(color,colors.getOrDefault(color,0)+1);

            result[i] = colors.size();
        }
        return result;
    }
}