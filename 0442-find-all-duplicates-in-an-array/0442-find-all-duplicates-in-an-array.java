class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        int n= nums.length;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int freq=map.get(nums[i]);
                map.put(nums[i],freq+1);
            }
            else map.put(nums[i],1);
        }
        for(int ele:map.keySet())
        {
            if(map.get(ele)>1)
            {
                ans.add(ele);
            }
        }
        return ans;
    }
}