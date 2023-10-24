class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
       int count = 0;
        int index = 0;
        int sum = 0;
        for (int i : nums) {
            int bits = setBits(index++);
            if (bits == k) {
                sum += i;
            }
        }
        return sum;
    }

    public int setBits(int index) {
        int count = 0;
        while (index > 0) {
            if (index % 2 != 0) {
                count++;
            }
            index = index / 2;
        }
        return count;  
    }
}