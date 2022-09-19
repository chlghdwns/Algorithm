import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        
        // 최소 당첨
        int low_win = 0;
        for (int i : win_nums){
            for (int k : lottos){
                if (i == k) low_win++;
            }
        }
        for (int i = 6 ; i >= 0 ; i--){
            if (i == low_win) answer[1] = i <= 1 ? 6 : Math.abs(i-7);
        }
        
        //최대 당첨
        for (int i : win_nums) {
            int zero_place = 0;
            int cnt = 0;
            int zero_cnt = 0;

            for (int k : lottos) {
                if (k == 0){
                    zero_place = cnt;
                    zero_cnt++;
                }
                if (i == k) break;
                cnt++;
            }
            if (cnt == 6 && zero_cnt > 0) lottos[zero_place] = i;
        }
        
        int high_win = 0;
        for (int i : win_nums){
            for (int k : lottos){
                if (i == k) high_win++;
                
            }
        }
        for (int i = 6 ; i >= 0 ; i--){
            if (i == high_win) answer[0] = i <= 1 ? 6 : Math.abs(i-7);
        }
        return answer;
    }
}