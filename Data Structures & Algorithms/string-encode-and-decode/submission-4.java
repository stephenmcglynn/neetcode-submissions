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
        StringBuilder sb = new StringBuilder(str);
        while(currentIndex < str.length()){
            int hashIndex = sb.indexOf("#");
            String numberSubstring = sb.substring(currentIndex, hashIndex);
            int skipAmount = Integer.valueOf(numberSubstring);
            int hop = numberSubstring.length()+1;

            decoded.add(sb.substring(currentIndex+hop,skipAmount+currentIndex+hop));
            sb.delete(currentIndex, skipAmount+hop);
        
            if(currentIndex >= sb.length()){
                break;
            }
            currentIndex = 0;
        }
        return decoded;
    }
}
