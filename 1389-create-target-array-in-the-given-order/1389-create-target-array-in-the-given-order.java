class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];
        for (int i = 0; i < nums.length; i++)
            target = fillArray(target, nums[i], index[i]);

        return target;
    }
     public static int[] fillArray(int[] target, int value, int index) {
        for (int i = target.length - 1; i > index; i--)
            target[i] = target[i - 1];

        target[index] = value;
        return target;
    }
}