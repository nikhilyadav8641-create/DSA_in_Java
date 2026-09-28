class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n= nums.length;
        int ans=-1;
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
           {
             ans=nums[i];
             break;
           }
        }
        return ans;
    }
}