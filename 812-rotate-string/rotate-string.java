class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String Check = s + s;
        // abcd + abcd = abcdabcd (find = cdab) {it exists in the concatinated string}
        // coause the find is only the rotated form of the original string
        return Check.contains(goal);
    }
}