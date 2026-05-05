class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> storedGroups = new HashMap<>();
        for(String s: strs){
            int[] count = new int[26];
            for(int i = 0; i < s.length(); i++){
                count[s.charAt(i)-'a'] +=1;
            }

            String key = Arrays.toString(count);

            ArrayList<String> list = storedGroups.getOrDefault(key, new ArrayList<String>());
            list.add(s);
            storedGroups.put(key, list);
        }

        return new ArrayList<>(storedGroups.values());
    }
}
