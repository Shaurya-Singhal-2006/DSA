class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        int count = 0;
        for(int i = 0 ; i < sentences.length ; i++){
            String sen = sentences[i];
            count = 0;
            for(int j = 0 ; j < sen.length() ; j++){
                if(sen.charAt(j) == ' '){
                    count++;
                }
            }
            if(count > max){
                max = count;
            }
        }
        return max + 1;
        // + 1 because there are always one more word then the no. of spaces
    }
}