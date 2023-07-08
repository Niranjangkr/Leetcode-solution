class Solution {
    public boolean checkIfPangram(String sentence) {
        Map<Character, Integer> alphabet = new HashMap<>();
        for (char c: sentence.toCharArray()){
            int count = alphabet.getOrDefault(c, 0);
            alphabet.put(c, count + 1);
        }
        return  (alphabet.size() == 26)?true:false;
    }
}

// method 2
class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] letters = new boolean[26];
        for(char c: sentence.toCharArray()){
            letters[c - 'a'] = true;
        }
        
        for(boolean letterExist: letters){
            if(!letterExist){
                return false;
            }
        }
        return true;
    }
}

// method 3 
class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> s = new HashSet<>();
        for (char c: sentence.toCharArray()){
            s.add(c);
        }
        return 26 == s.size();
    }
}