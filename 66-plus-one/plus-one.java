class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length - 1;
        int input = 1;
        int answer = 0;
        for(int i = 0 ; i < digits.length ; i++){
            if(input == 1){
                answer = digits[last] + 1;
                if(last >= 0 && answer < 10){
                    digits[last] = answer;
                    input = 0;
                    last--;
                }
                else if(answer == 10 && last > 0){
                    digits[last] = 0;
                    input = 1;
                    last--;
                }
                if(last == 0 && input == 1 && digits[last] == 9){
                    int[] arr = new int[digits.length+1];
                    arr[last] = 1;
                    input = 0;
                    return arr;
                }
            }
        }
        return digits;
    }
}