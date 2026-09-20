class Solution {
    public int[] twoSum(int[] nums, int target) {
        //HashMap<Integer,Integer> map = new HashMap();
        // //filling hashmap
        // for(int i = 0; i<nums.length; i++){
        //     map.put(nums[i],i);
        // }

        // //Searching
        // for(int i = 0; i<nums.length; i++){
        //     int num = nums[i];
        //     int remain = target - num;
        //     if(map.containsKey(remain)){
        //         int index = map.get(remain);
        //         if(index == i) continue;
        //         return new int[]{i,index};
        //     }
        // }  
        // return new int[]{}; 

        for(int i = 0; i < nums.length; i++){
                int remain =  target - nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(remain == nums[j]){
                    return new int[]{i,j};
                }
            }
        } 
        return new int[]{};
    }
}