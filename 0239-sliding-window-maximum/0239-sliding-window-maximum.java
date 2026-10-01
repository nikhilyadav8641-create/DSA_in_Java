class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n=a.length;
        int[] ans= new int[n-k+1];
        int idx=0;
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0; i < n; i++) {

            // Remove elements which are outside the window
            if(!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.removeFirst();

            // Remove smaller elements
            while(!dq.isEmpty() && a[dq.peekLast()] <= a[i])
                dq.removeLast();

            dq.addLast(i);

            // Window is ready
            if(i >= k - 1) {
                ans[idx++] = a[dq.peekFirst()];
            }
        }
	return ans;
    }
}