class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> output = new ArrayList<>();
        boolean result = false;
        for(int i = 0 ; i < words.length ; i++){
            String word = words[i];
            result = false;
            for(int j = 0 ; j < word.length() ; j++){
                if(word.charAt(j) == x){
                    result = true;
                }
            }
            if(result){
                output.add(i);
            }
        }
        return output;
    }
}