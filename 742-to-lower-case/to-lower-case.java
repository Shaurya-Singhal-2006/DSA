class Solution {
    public String toLowerCase(String s){
        String output = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                output += (char)(s.charAt(i) + 32);
            }
            else{
                output += s.charAt(i);
            }
        }
        return output;
    }
}