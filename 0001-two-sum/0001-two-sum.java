class Solution {
    public int[] twoSum(int[] arr, int tar) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans= new int[2];
        for(int i=0;i<arr.length;i++)
        {
            int ele=tar-arr[i];
            if(map.containsKey(ele) && map.get(ele)!=i)
				{
					ans[0]=i;
                    ans[1]=(map.get(ele));
					break;
				}
            map.put(arr[i],i);
            
        }
        return ans;
    }
}