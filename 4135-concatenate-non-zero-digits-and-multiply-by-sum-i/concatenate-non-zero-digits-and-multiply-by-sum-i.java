class Solution {
    public long sumAndMultiply(int n) {
        String str = String.valueOf(n);
        long new_digit = 0;
        long sum = 0;
        for(int i = 0 ; i < str.length() ; i++){
            int digit = str.charAt(i) - '0';
            if(digit != 0){
                new_digit = new_digit*10 + digit;
                sum += digit;
            }
        }
        return new_digit*sum;
    }
}