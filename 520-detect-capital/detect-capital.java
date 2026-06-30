class Solution {
    public boolean detectCapitalUse(String word) {
        int countCapitals = 0;
        for(int i = 0 ; i < word.length() ; i++){
            if(Character.isUpperCase(word.charAt(i))){
                countCapitals++;
            }
        }
        if(countCapitals == word.length() || countCapitals == 0 || (countCapitals == 1 && Character.isUpperCase(word.charAt(0)))){
            return true;
        }
        return false;
    }
}