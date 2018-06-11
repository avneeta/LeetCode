/*
*Using hashmap
*Iterate through the list, while pushing the compliment of the current element (target - current element)
*into the hashmap as the key and index as the value
*If element is in the keySet of hashMap, we have found the pair. Return the value (index of preveious element in the pair)
* and i (index of current element in the pair) 
*/

import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (hash.containsKey(nums[i])){
                result[0] = (Integer)hash.get(nums[i]);
                result[1] = i;
                return result;
            }
            hash.put((target - nums[i]), i);
        }
        return result;
    }
}