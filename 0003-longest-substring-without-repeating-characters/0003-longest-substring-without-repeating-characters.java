class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int left=0;
        int maxLen=0;
        for(int i=0;i<s.length();i++)//i can be trated as right;
        {
            char ch= s.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>=left)
            {
                left=map.get(ch)+1;
            }
            map.put(ch,i);
            maxLen=Math.max(maxLen,i-left+1);
        }
        return maxLen;
    }
}