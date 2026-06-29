class Solution {
    public boolean isPalindrome(int x) {
        // to check if the number is negative
        if(x<0){
            return false;
        }
        int ori = x;
        int pali = 0;
        while(x!=0){
            int last = x % 10;
            pali = last + pali*10;
            x = x/10;
        }   
        if(ori == pali){
            return true;
        }
        else{
            return false;
        }
    }
}