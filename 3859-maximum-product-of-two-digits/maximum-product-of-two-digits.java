class Solution {
    public int maxProduct(int n) {
        int first = n%10;
        n /= 10;
        int second = n%10;
        n /= 10;
        if(second > first){
            int temp = second;
            second = first;
            first = temp;
        }

        while(n!=0){
            int x = n%10;
            if(x > first){
                second = first;
                first = x;
            }
            else if(x > second){
                second = x;
            }
            n /= 10;
        }
        return first * second;
    }
}