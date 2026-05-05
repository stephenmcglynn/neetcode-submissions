class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder("");
        for(String s: strs){
            encodedString.append(s.length() +"#");
            encodedString.append(s);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        int currentIndex = 0;
        ArrayList<String> decoded = new ArrayList<>();
        while(currentIndex < str.length()){
            int hashIndex = str.indexOf("#", currentIndex);
            String numberSubstring = str.substring(currentIndex, hashIndex);
            int skipAmount = Integer.valueOf(numberSubstring);
            int hop = numberSubstring.length()+1;

            decoded.add(str.substring(currentIndex+hop,skipAmount+currentIndex+hop));

            currentIndex = currentIndex+hop+skipAmount;
        }
        return decoded;
    }
}
