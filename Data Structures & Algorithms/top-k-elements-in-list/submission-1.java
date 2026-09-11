class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          Map<Integer, Integer> frequency = new HashMap<>();

    for (int num : nums) {
        frequency.put(num, frequency.getOrDefault(num, 0) + 1);
    }

    PriorityQueue<Integer> pq =
        new PriorityQueue<>((a, b) -> frequency.get(a) - frequency.get(b));

    for (int num : frequency.keySet()) {
        pq.offer(num);

        if (pq.size() > k) {
            pq.poll();
        }
    }

    int[] result = new int[k];

    for (int i = 0; i < k; i++) {
        result[i] = pq.poll();
    }

    return result;
}
}
