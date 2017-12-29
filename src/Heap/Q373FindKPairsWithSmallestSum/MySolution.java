package Heap.Q373FindKPairsWithSmallestSum;
import java.util.*;

public class MySolution {
	public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if (nums1.length == 0 || nums2.length == 0){
            return new ArrayList<int[]>();
        }
        
        Map<Integer, ArrayList<int[]>> total = new HashMap<Integer, ArrayList<int[]>>();
        for (int j = 0; j<nums2.length; j++){
            for (int i = 0; i<nums1.length; i++){
                int sum = nums1[i] + nums2[j];
                if (total.get(sum)==null){
                    ArrayList<int[]> pairs = new ArrayList<int[]>();
                    pairs.add(new int[]{nums1[i],nums2[j]});
                    total.put(sum, pairs);
                } else {
                    total.get(sum).add(new int[]{nums1[i], nums2[j]});
                }
            }
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i : total.keySet()){
            pq.offer(i);
        }
        
        ArrayList<int[]> result = new ArrayList<int[]>();
        int i = 0;
        while (i<k && pq.peek() != null){
            ArrayList<int[]> small = total.get(pq.poll());
            for(int j = 0; j<small.size(); j++){
                result.add(small.get(j));
                i++;
                if (i == k){
                    return result;
                }
            }
        }
        return result;
    }
}
