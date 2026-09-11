class Solution {
    public int longestConsecutive(int[] arr) {
        HashSet<Integer> set= new HashSet<>();
        for(int ele: arr) set.add(ele);
        int max=0;
        for(int ele: set)
        {
            if(!set.contains(ele-1))
            {
                int count=1;
                while(set.contains(ele+count))
                count++;
                if(count>max)
                max=count;
            }
        }
        return max;
    }
}