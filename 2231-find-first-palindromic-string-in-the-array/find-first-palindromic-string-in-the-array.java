class Solution {

    public boolean isPali(String s){
        int left = 0;
        int right = s.length()-1;
        int mid = 0 + (s.length() - 0) / 2;
        for(int i = 0 ; i <= mid ; i++){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public String firstPalindrome(String[] words) {
        String result = "";
        for(int i = 0 ; i < words.length ; i++){
            if(isPali(words[i])){
                result += words[i];
                break;
            }
        }
        return result;
    }
}