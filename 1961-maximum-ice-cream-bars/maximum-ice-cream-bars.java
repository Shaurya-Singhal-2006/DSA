class Solution {
    public int maxIceCream(int[] costs, int coins){
        Arrays.sort(costs);
        int count = 0;
        int sum = 0;
        for(int num : costs){
            // only add if the sum will be smaller than coins
            if((sum + num) <= coins){
                sum+= num;
                count++;
            }
        }
        return count;
    }
}