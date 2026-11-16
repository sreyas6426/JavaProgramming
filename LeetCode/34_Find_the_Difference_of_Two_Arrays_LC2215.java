import java.util.*;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>(), b = new HashSet<>();
        for (int x : nums1) a.add(x);
        for (int x : nums2) b.add(x);

        List<Integer> x = new ArrayList<>(), y = new ArrayList<>();
        for (int n : a) if (!b.contains(n)) x.add(n);
        for (int n : b) if (!a.contains(n)) y.add(n);

        return Arrays.asList(x, y);
    }
}
