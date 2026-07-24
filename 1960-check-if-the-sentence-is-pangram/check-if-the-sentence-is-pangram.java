class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }
        Boolean result = false;
        boolean[] visit = new boolean[26];
        int count = 0;
        for(int i = 0 ; i < sentence.length() ; i++){
            char ch = sentence.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                int idx = ch - 'a';
                if(!visit[idx]){
                    visit[idx] = true;
                    count++;
                }
            }
        }
        if(count == 26){
            result = true;
        }
        return result;
    }
}