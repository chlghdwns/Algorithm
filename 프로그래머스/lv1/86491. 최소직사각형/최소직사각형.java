class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        int w_max,h_max;
        w_max = h_max = 0;

        for (int i=0 ; i < sizes.length ; i++){
            if (sizes[i][0] < sizes[i][1]){
                temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }

        int cnt=0;
        w_max = sizes[0][0];
        h_max = sizes[0][1];
        for (int[] i : sizes){
            if (w_max < sizes[cnt][0]) w_max = sizes[cnt][0];
            if (h_max < sizes[cnt][1]) h_max = sizes[cnt][1];
            cnt++;
        }
        
        return answer = w_max * h_max;
    }
}