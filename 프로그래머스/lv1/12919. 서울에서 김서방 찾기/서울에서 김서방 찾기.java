class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int cnt = 0;
        for (String a : seoul) {
            if (a.equals("Kim")) {
                answer = String.format("김서방은 %d에 있다",cnt);
            }
            cnt++;
        }
        return answer;
    }
}