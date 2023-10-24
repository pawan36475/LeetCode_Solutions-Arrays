class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         int maximum = 0;

        for (int m = 0; m < nums.length; m++)
            maximum = Math.max(nums[m], maximum);

        int result[] = new int[nums.length];
        int[] frequency = new int[maximum + 1];
        int[] cumulativeSum = new int[maximum + 1];

        for (int i = 0; i < nums.length; i++)
            frequency[nums[i]]++;

        for (int j = 1; j < frequency.length - 1; j++)
            frequency[j] = frequency[j] + frequency[j - 1];

        for (int k = 0; k < nums.length; k++) {

            result[k] = nums[k] == 0 ? 0 : frequency[nums[k] - 1];

        }

        return result; 
    }
}