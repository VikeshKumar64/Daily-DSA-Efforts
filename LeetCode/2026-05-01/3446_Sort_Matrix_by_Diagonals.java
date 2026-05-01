import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(grid[i][j]);
            }
        }

        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);

            if (key >= 0) {
                Collections.sort(list, Collections.reverseOrder());
            } else {
                Collections.sort(list);
            }
        }

        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int key : map.keySet()) {
            indexMap.put(key, 0);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                int idx = indexMap.get(key);

                grid[i][j] = map.get(key).get(idx);
                indexMap.put(key, idx + 1);
            }
        }

        return grid;
    }
}