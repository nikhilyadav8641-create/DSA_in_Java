import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        // Put all elements of nums1 into HashSet
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        HashSet<Integer> ans = new HashSet<>();

        // Check elements of nums2
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                ans.add(nums2[i]);
            }
        }

        int[] result = new int[ans.size()];
        int i = 0;

        for (int num : ans) {
            result[i++] = num;
        }

        return result;
    }
}