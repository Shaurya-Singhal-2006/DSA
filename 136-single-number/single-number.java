class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        // a ^ a = 0
        // a ^ 0 = a
        for(int i : nums){
            xor ^= i;
        }
        return xor;
    }
}