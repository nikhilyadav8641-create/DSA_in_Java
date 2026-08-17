class Solution {
    public int maximumCount(int[] arr) {

        int n = arr.length;

        int low = 0, high = n - 1;
        int neg, pos;

        // Find first non-negative number
        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= 0) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        if (arr[low] < 0)
            neg = n;
        else
            neg = low;


        // Find first positive number
        low = 0;
        high = n - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] <= 0) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        if (arr[low] > 0)
            pos = n - low;
        else
            pos = 0;


        return Math.max(pos, neg);
    }
}