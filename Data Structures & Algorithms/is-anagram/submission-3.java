class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }


        HashMap<Character, Integer> storedString = new HashMap<>();
        HashMap<Character, Integer> secondString = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char currentS = s.charAt(i); 
            char currentT = t.charAt(i);
            storedString.put(currentS, storedString.getOrDefault(currentS,0)+1);
            secondString.put(currentT, secondString.getOrDefault(currentT,0)+1);
        }

        return storedString.equals(secondString);

    }
}
