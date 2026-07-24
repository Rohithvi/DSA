class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) return false;
        boolean[] seen = new boolean[26];
        for (char ch : sentence.toCharArray()){
            seen[ch - 'a'] = true;
        }
        for ( boolean b : seen ){
            if(!b) 
            return false;
        }
        return true;
        }
}
