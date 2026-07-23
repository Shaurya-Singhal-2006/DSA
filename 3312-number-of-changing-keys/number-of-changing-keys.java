class Solution {
    public int countKeyChanges(String s) {
        if(s.length() < 2){
            return 0;
        }
        String str = s.toLowerCase();
        int result = 0;
        for(int i = 1 ; i < str.length() ; i++){
            if(str.charAt(i-1) != str.charAt(i)){
                result++;
            }
        }
        return result;
    }
}