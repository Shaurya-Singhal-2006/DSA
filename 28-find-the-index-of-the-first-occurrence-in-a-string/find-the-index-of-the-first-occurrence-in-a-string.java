class Solution {
    public int strStr(String haystack, String needle) {
        int x = 0;
        int y = needle.length();
        for(int i = 0 ; y <= haystack.length() ; i++){
            if(haystack.substring(x,y).equals(needle)){
                return i;
            }
            x++;
            y++;
        }
        return -1;
    }
}