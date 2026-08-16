class Solution {
    public int sqrt(long n)
    {
        if(n==0) return 0;
        long low=1,high=n;
        while(low<=high)
        {
            long mid= low+(high-low)/2;
            if(mid==n/mid) return (int)mid;
            else if(mid>n/mid) high = mid-1;
            else low=mid+1;
        }
        return (int)high;
    }
    public int arrangeCoins(int n) {
        long m=(long)n;
        return (sqrt(8*m+1)-1)/2;
    }
}