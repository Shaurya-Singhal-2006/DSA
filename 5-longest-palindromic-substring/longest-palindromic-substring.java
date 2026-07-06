class Solution {

    public Boolean isPali(String s){
        int left = 0;
        int right = s.length() - 1;
        while(right > left){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        } 
        return true;
    }


    public String longestPalindrome(String s) {
        if(s.length() <= 1){
            return s;
        }
        String output = "";
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i + 1 ; j <= s.length() ; j++){
                String sub = s.substring(i,j);
                if(isPali(sub)){
                    if(output.length() < sub.length()){
                        output = sub;
                    }
                }
            }
        }
        return output;
    }
}