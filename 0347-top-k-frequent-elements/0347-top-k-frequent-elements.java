class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        // int[] ans = new int[k];
        // HashMap<Integer,Integer> map= new HashMap<>();
        // int n= arr.length;
        // for(int i=0;i<n;i++)
        // {
        //     if(map.containsKey(arr[i]))
        //     {
        //         int freq=map.get(arr[i]);
        //         map.put(arr[i],freq+1);
        //     }
        //     else map.put(arr[i],1);
        // }
        // for(int i=0;i<k;i++)
		// 	{
		// 		int maxEle=-1;
		// 		int maxFreq=-1;
		// 		for(int ele:map.keySet())
		// 			{
		// 				if(map.get(ele)>maxFreq)
		// 				{
		// 					maxFreq=map.get(ele);
		// 					maxEle=ele;
		// 				}
		// 			}
		// 		ans[i]=maxEle;
		// 		map.remove(maxEle);
		// 	}
        //     return ans;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 1: Count frequencies (Cleaner using getOrDefault)
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Put map entries into a list so we can sort them by frequency
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        
        // Sort descending by frequency
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        
        // Step 3: Pick the top k elements
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }
        
        return ans;
    }
}