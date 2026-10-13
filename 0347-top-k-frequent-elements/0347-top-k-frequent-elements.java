class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> map= new HashMap<>();
        int n= arr.length;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int freq=map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
            else map.put(arr[i],1);
        }
        for(int i=0;i<k;i++)
			{
				int maxEle=-1;
				int maxFreq=-1;
				for(int ele:map.keySet())
					{
						if(map.get(ele)>maxFreq)
						{
							maxFreq=map.get(ele);
							maxEle=ele;
						}
					}
				ans[i]=maxEle;
				map.remove(maxEle);
			}
            return ans;
    }
}