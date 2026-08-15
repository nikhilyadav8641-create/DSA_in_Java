class Solution {
    public int[] searchRange(int[] arr, int tar) {
        int num[]=new int[2];
        int low=0,high=arr.length-1,last=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==tar) {
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<tar) low=mid+1;
            else high=mid-1;
        }
        num[1]=last;
        low=0;high=arr.length-1;
        int first=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==tar) {
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<tar) low=mid+1;
            else high=mid-1;
        }
        num[0]=first;
        return num;
    }

}