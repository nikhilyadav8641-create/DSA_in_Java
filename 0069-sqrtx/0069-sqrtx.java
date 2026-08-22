class Solution {
    public int mySqrt(int n) {
        int low=0,high=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long square=(long)mid*mid;
            if(square==n) return mid;
            else if(square>n) high=mid-1;
            else low=mid+1;
        }
        return high;
    }
}