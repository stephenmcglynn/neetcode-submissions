class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numFreq = new HashMap<>();

        for(int i: nums){
            numFreq.put(i, numFreq.getOrDefault(i, 0)+1);
        }

        ArrayList<Integer>[] bucketList = new ArrayList[nums.length+1];
        for(Integer i: numFreq.keySet()){
            int freq = numFreq.get(i);
            if(bucketList[freq] == null){
                bucketList[freq] = new ArrayList<Integer>();
            }
            
            bucketList[freq].add(i);
            
        }

        int[] result = new int[k];
        int counter = 0;

        for(int i = bucketList.length -1; i > -1; i--){
            if(bucketList[i] != null){
                for(int j:bucketList[i]){
                    result[counter] = j;
                    counter++;
                }
            }
            if(counter == k){
                break;
            }
        }

        return result;
    }
}
