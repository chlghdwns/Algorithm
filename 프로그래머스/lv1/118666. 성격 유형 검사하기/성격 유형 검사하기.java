class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[][] indicator = new int[4][2];
        int cnt = 0;

        for (int i : choices){
            System.out.printf(i + "");
            if (i<4){
                if (survey[cnt].charAt(0) == 'R')
                    indicator[0][0] += i==1 ? 3 : i==2 ? 2 : 1;
                else if (survey[cnt].charAt(0) == 'T')
                    indicator[0][1] += i==1 ? 3 : i==2 ? 2 : 1;
                else if (survey[cnt].charAt(0) == 'C')
                    indicator[1][0] += i==1 ? 3 : i==2 ? 2 : 1;
                else if (survey[cnt].charAt(0) == 'F')
                    indicator[1][1] += i==1 ? 3 : i==2 ? 2 : 1;
                else if (survey[cnt].charAt(0) == 'J')
                    indicator[2][0] += i==1 ? 3 : i==2 ? 2 : 1;
                else if (survey[cnt].charAt(0) == 'M')
                    indicator[2][1] += i==1 ? 3 : i==2 ? 2 : 1;
                else if (survey[cnt].charAt(0) == 'A')
                    indicator[3][0] += i==1 ? 3 : i==2 ? 2 : 1;
                else if (survey[cnt].charAt(0) == 'N')
                    indicator[3][1] += i==1 ? 3 : i==2 ? 2 : 1;
            }
            else if (i>4){
                if (survey[cnt].charAt(1) == 'R')
                    indicator[0][0] += i==7 ? 3 : i==6 ? 2 : 1;
                else if (survey[cnt].charAt(1) == 'T')
                    indicator[0][1] += i==7 ? 3 : i==6 ? 2 : 1;
                else if (survey[cnt].charAt(1) == 'C')
                    indicator[1][0] += i==7 ? 3 : i==6 ? 2 : 1;
                else if (survey[cnt].charAt(1) == 'F')
                    indicator[1][1] += i==7 ? 3 : i==6 ? 2 : 1;
                else if (survey[cnt].charAt(1) == 'J')
                    indicator[2][0] += i==7 ? 3 : i==6 ? 2 : 1;
                else if (survey[cnt].charAt(1) == 'M')
                    indicator[2][1] += i==7 ? 3 : i==6 ? 2 : 1;
                else if (survey[cnt].charAt(1) == 'A')
                    indicator[3][0] += i==7 ? 3 : i==6 ? 2 : 1;
                else if (survey[cnt].charAt(1) == 'N')
                    indicator[3][1] += i==7 ? 3 : i==6 ? 2 : 1;
            }
            cnt++;
        }

        answer = answer.concat(indicator[0][0] >= indicator[0][1] ? "R":"T");
        answer = answer.concat(indicator[1][0] >= indicator[1][1] ? "C":"F");
        answer = answer.concat(indicator[2][0] >= indicator[2][1] ? "J":"M");
        answer = answer.concat(indicator[3][0] >= indicator[3][1] ? "A":"N");

        return answer;
    }
}