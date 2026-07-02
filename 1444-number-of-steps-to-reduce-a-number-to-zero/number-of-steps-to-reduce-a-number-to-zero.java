class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        if(num == 0){
            return count;
        }
        while(num != 0){
            if(num % 2 != 0){
                num -= 1;
                count++;
                continue;
            }
            num /= 2;
            count++;
        }
        return count;
    }
}