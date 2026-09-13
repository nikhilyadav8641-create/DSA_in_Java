class Solution {
    int[] merge(int[] arr1,int arr2[])
    {
        int n=arr1.length;
        int m=arr2.length;
       int[] ans = new int[n+m]; 
        int i=0,j=0,k=0;
        while(i<n && j<m)
        {
            if(arr1[i]<=arr2[j])
            {
                ans[k]=arr1[i];
                i++;
            }
            else
            {
                ans[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n)
        {
            ans[k]=arr1[i];
            i++;k++;
        }
        while(j<m)
        {
            ans[k]=arr2[j];
            j++;k++;
        }
        return ans;
    }
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int[] ans= new int[n+m];
        ans=merge(arr1,arr2);
        int med=(ans.length)/2;
        double median=-1;
        if(ans.length % 2 == 1)
        {
            median = (double)ans[med];
        }
        else
        {
            median = (double)(ans[med - 1] + ans[med]) / 2.0;
        }
        return median;
    }
}