class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int k = 0, val = 0;
        for (int i = 0; i < nums.length; i += 2) {
            val = nums[i];
            for (int j = 0; j < val; j++) {
                result.add(nums[i + 1]);
            }
        }
        int[] output = new int[result.size()];
        for (int i : result) {
            output[k++] = i;
        }
        return output;
    }
}