class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int idx=0;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
            else
            map.put(nums[i],1);
        }
        for(int i=0;i<n;i++)
        {
            if(map.get(nums[i])==1)
            ans[idx++]=nums[i];
        }
        return ans;
    }
}