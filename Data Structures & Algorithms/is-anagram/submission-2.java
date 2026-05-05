class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }


        HashMap<Character, Integer> storedString = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i); 
            if(storedString.containsKey(current)){
                storedString.put(current, storedString.get(current)+1);
            }else{
                storedString.put(current, 1);
            }
            
        }

        HashMap<Character, Integer> secondString = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char current = t.charAt(i);
            if(secondString.containsKey(current)){
                secondString.put(current, secondString.get(current)+1);
            }else{
                secondString.put(current, 1);
            }
            
        }

        return storedString.equals(secondString);

    }
}
