

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> storedNum = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(storedNum.containsKey(nums[i])){
                return true;
            }
            storedNum.put(nums[i], i);
        }
        return false;
    }
}