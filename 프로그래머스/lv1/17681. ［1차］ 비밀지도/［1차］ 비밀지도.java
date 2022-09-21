class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] temp = new String[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (answer[i] == null) {
                answer[i] = "";
            }
            for (int j = 0; j < n; j++) {
                if ('1' == String.format("%0" + n + "d",
                        Long.valueOf(Long.toBinaryString(arr1[i] | arr2[i]))).charAt(j)) {
                    answer[i] += '#';
                } else {
                    answer[i] += ' ';
                }
            }
        }

        return answer;
    }
}