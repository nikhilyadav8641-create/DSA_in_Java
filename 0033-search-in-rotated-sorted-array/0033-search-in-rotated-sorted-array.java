// class Solution {
//    void reverse(int arr[],int low,int high)
//     {
//         while(low<high)
//         {
//             int temp= arr[low];
//             arr[low]=arr[high];
//             arr[high]=temp;
//             low++;
//             high--;
//         }
//     }
//     public int search(int[] arr, int tar) {
//         int n= arr.length;
//         reverse(arr,0,n-1);
//         reverse(arr,0,3-1);
//         reverse(arr,3,n-1);
//         int low=0,high=arr.length-1;
//         while(low<=high)
//         {
//             int mid=low+(high-low)/2;
//             if(arr[mid]==tar)
//                 return mid;
//             else if(arr[mid]<tar)
//             low=mid+1;
//             else high=mid -1;
//         }
//         return -1;
//     }
// }
class Solution {

    public int search(int[] arr, int tar) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == tar)
                return mid;

            // left part is sorted
            if (arr[low] <= arr[mid]) {

                if (arr[low] <= tar && tar < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }

            // right part is sorted
            else {

                if (arr[mid] < tar && tar <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }
}

