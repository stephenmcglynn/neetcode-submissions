class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> storedNums = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int neededNumber = target - nums[i];
            if(storedNums.containsKey(neededNumber)){
                return new int[] {storedNums.get(neededNumber), i};
            }

            storedNums.put(nums[i], i);
        }
        return new int[] {0,0};
    }
}
