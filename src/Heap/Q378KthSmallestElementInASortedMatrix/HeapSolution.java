package Heap.Q378KthSmallestElementInASortedMatrix;

import java.util.PriorityQueue;

public class HeapSolution {
	public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix[0].length; j++){
                pq.offer(matrix[i][j]);
            }
        }
        
        int result = 0;
        for (int i = 0; i<k; i++){
            result = pq.poll();
        }
        return result;
    }
}
