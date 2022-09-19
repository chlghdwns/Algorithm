import java.util.*;
//정적 배열만 사용한다는 가정
public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int temp;
        int cnt = 1;

        temp = arr[0];
        for (int i : arr){
            if (temp == i) continue;
            else {
                temp = i;
                cnt++;
            }
        }

        answer = new int[cnt];
        answer[0] = arr[0];
        int n_cnt = 0;
        for (int i = 0;i < arr.length;i++){
            if (answer[n_cnt] != arr[i]) {
                n_cnt++;
                answer[n_cnt] = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int[] input1={1,1,3,3,0,1,1};
        int[] input2={4,4,4,3,3};
        Solution abc = new Solution();
        System.out.println(Arrays.toString(abc.solution(input1)));
        System.out.println(Arrays.toString(abc.solution(input2)));
    }
}