class Solution {
    ArrayList<String> decoded = new ArrayList<>();
    public String encode(List<String> strs) {
        String seed = "This is possibly the most inneficient solution but its the first thing that comes to mind";
        String delimiter = String.valueOf(seed.hashCode());

        StringBuilder string = new StringBuilder("");
        for(String s: strs){
            string.append(s);
            string.append(delimiter);
        }

        return string.toString();
    }

    public List<String> decode(String str) {
        String seed = "This is possibly the most inneficient solution but its the first thing that comes to mind";
        String delimiter = String.valueOf(seed.hashCode());
        decodeStringRecursion(str);

        return decoded;
    }

    public void decodeStringRecursion(String str){
        String seed = "This is possibly the most inneficient solution but its the first thing that comes to mind";
        String delimiter = String.valueOf(seed.hashCode());
        if(str.length() == 0){
            return;
        }
        int delimIndex = str.indexOf(delimiter);
        String foundWord = str.substring(0, delimIndex);

        decoded.add(foundWord);
        String remainingString = str.substring(delimIndex+delimiter.length());

        if(remainingString.length() < 2){
            return;
        }
        decodeStringRecursion(remainingString);
    }
}
