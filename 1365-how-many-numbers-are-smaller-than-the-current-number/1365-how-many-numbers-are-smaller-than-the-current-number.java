class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int result[] = new int[nums.length];
        int[] frequency = new int[102];
        int[] cumulativeSum = new int[102];

        for (int i = 0; i < nums.length; i++)
            frequency[nums[i]]++;

        for (int j = 1; j < frequency.length - 1; j++)
            frequency[j] = frequency[j] + frequency[j - 1];

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == 0) {
                result[k] = 0;
            } else{
            result[k] = frequency[nums[k] - 1];
        }
        }

        return result;
    }
}