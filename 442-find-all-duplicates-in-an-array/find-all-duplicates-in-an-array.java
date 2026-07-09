class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        // Initialize a dynamic list with 0 elements
        // so can increase its size according to the number of duplicate elements
        ArrayList<Integer> output = new ArrayList<>();
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i-1] == nums[i]){
                output.add(nums[i]);
            }
        }
        return output;
    }
}