class Solution {
    public int firstUniqChar(String s) {
        int result = -1;
        int[] freq = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            int idx = s.charAt(i) - 'a';
            freq[idx]++;
        }
        for(int i = 0 ; i < s.length() ; i++){
            int idx = s.charAt(i) - 'a';
            if(freq[idx] == 1){
                result = i;
                break;
            }
        }
        return result;
    }
}