class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] output = new int[nums.length];
        int cumulativeSumArray[] = new int[nums.length];
        cumulativeSumArray[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            cumulativeSumArray[i] = cumulativeSumArray[i - 1] + nums[i];

        for (int j = 0; j < cumulativeSumArray.length; j++) {
            if (j > 0) {
                output[j] = Math.abs((cumulativeSumArray[cumulativeSumArray.length - 1] - cumulativeSumArray[j])
                        - cumulativeSumArray[j - 1]);
            } else {
                output[j] = Math.abs(cumulativeSumArray[cumulativeSumArray.length - 1] - cumulativeSumArray[0]);
            }
        }
        return output;
    }
}