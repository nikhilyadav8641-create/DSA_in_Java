class Solution {
    public List<Integer> majorityElement(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> ans= new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int ele = arr[i];
            if(map.containsKey(ele))
            {
                int freq= map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(ele,1);
        }
        for(int ele : map.keySet())
        {
            if(map.get(ele)>(n/3))
            ans.add(ele);
        }
        return ans;
    }
}