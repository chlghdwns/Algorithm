import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashSet<String> set = new HashSet<String>(Arrays.asList(report));
        Iterator itr = set.iterator();
        HashMap<String, String> map = new HashMap<String, String>();



        while(itr.hasNext()){
            String temp = (String)itr.next();
            String[] s = temp.split(" ");
            if(map.containsKey(s[1])){
                String d = map.get(s[1]);
                map.put(s[1], d + " " + s[0]);
            }else{
                map.put(s[1], s[0]);
            }
        }

        Iterator entries = map.entrySet().iterator();
        while(entries.hasNext()){
            HashMap.Entry entry = (HashMap.Entry) entries.next();
            //String key = (String)entry.getKey();
            String value = (String)entry.getValue();
            //System.out.println(key+" "+value);
            String[] white = value.split(" ");


            if(white.length >= k ){

                for(int i = 0; i < white.length; i++){
                    for(int j = 0; j < id_list.length; j++){
                        if(white[i].equals(id_list[j])){

                            answer[j] += 1;
                        }
                    }
                }
            }
        }

        return answer;
    }
}