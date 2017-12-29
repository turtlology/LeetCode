package Heap.Q373FindKPairsWithSmallestSum;
import java.util.*;

//All the calculation goes to PriorityQueue

public class FastSolution {
	public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return nums1[a[0]] + nums2[a[1]] - nums1[b[0]] - nums2[b[1]];
            }
        });
        List<int[]> res = new ArrayList<>();
        if (k == 0 || nums1.length == 0 || nums2.length == 0) return res;
        for (int i = 0; i < nums1.length; i++)
            pq.add(new int[]{i, 0});
        for (int i = 0; i < k; i++) {
            if (pq.isEmpty()) break;
            int[] t = pq.poll();
            res.add(new int[]{nums1[t[0]], nums2[t[1]]});
            if (t[1] + 1 < nums2.length)
                pq.add(new int[]{t[0], t[1] + 1});
        }
        return res;
    }
}
