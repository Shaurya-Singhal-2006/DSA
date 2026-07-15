class Solution {
    public int differenceOfSums(int n, int m){
        int X = 0;
        int Y = 0;
        for(int i = 1 ; i <= n ; i++){
            if(i%m != 0){
                X += i;
            }
            else{
                Y += i;
            }
        }
        return X - Y;
    }
}