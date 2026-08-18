class Solution {
    public int missingNumber(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        	int ans= (arr.length*(arr.length+1)/2)-sum;
            return ans;
    }
}