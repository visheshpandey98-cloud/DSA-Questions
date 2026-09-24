class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;

        int xor = 0;

        for (int[] row : grid) {
            for (int num : row) {
                xor ^= num;
            }
        }

        for (int i = 1; i <= N; i++) {
            xor ^= i;
        }

        int bit = xor & -xor;

        int a = 0;
        int b = 0;

        for (int[] row : grid) {
            for (int num : row) {
                if ((num & bit) != 0)
                    a ^= num;
                else
                    b ^= num;
            }
        }

        for (int i = 1; i <= N; i++) {
            if ((i & bit) != 0)
                a ^= i;
            else
                b ^= i;
        }

        for (int[] row : grid) {
            for (int num : row) {
                if (num == a)
                    return new int[]{a, b};
            }
        }

        return new int[]{b, a};
    }
}