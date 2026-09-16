class Solution {
    public int maxPower(String s) {
        int maxfreq=1;
        int freq=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                freq++;
                if(freq>maxfreq)
                maxfreq=freq;
            }
            else
            freq=1;
        }
        return maxfreq;
    }
}