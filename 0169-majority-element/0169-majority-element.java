class Solution {
    public int majorityElement(int[] arr) {
        int n= arr.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            int ele=arr[i];
            if(map.containsKey(ele))
            {
                int freq=map.get(ele);
                map.put(ele,freq+1);
                if(map.get(ele)>n/2)
                {
                    ans=ele;
                break;
                }
            }
            else {
                map.put(ele,1);
                if (map.get(ele) > n / 2) {
                    ans = ele;
                    break;
                }
            }

        }
        return ans;
    }
}