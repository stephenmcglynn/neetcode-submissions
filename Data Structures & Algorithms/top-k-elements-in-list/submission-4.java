class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numFreq = new HashMap<>();

        for(int i: nums){
            numFreq.put(i, numFreq.getOrDefault(i, 0)+1);
        }

        ArrayList<Integer>[] bucketList = new ArrayList[nums.length+1];
        System.out.println(Arrays.toString(bucketList));
        for(Integer i: numFreq.keySet()){
            if(bucketList[numFreq.get(i)] == null){
                bucketList[numFreq.get(i)] = new ArrayList<Integer>(List.of(i));
            }else{
                bucketList[numFreq.get(i)].add(i);
            }
            System.out.println("current freq/index = " + i + ", current key = " + numFreq.get(i));
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

        System.out.println(Arrays.toString(bucketList));
        return result;
    }
}
