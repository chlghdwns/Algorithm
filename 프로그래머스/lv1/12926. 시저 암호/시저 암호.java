class Solution {
    public String solution(String s, int n) {
		char[] ss = s.toCharArray();
		
		for (int i = 0; i < ss.length; i++) {
			if (ss[i] == ' ') {
				continue;
			}
		
		char firstAlphabet = ss[i] >= 'a' ? 'a' : 'A';
		ss[i] = (char)(firstAlphabet + (ss[i] - firstAlphabet + n) % 26);
		}
	
		return new String(ss);
    }
}
