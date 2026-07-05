class Solution {
    public int[] getConcatenation(int[] nums){
        int[] result = new int[nums.length *2];
        // System.arracopy(source , source position(starting index) , destination , destination position (stating idx) , no. of elements to copy )
        System.arraycopy(nums,0,result,0,nums.length);
        System.arraycopy(nums,0,result,nums.length,nums.length);
        return result;
    }
}