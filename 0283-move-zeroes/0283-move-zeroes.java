class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        // Put all non-zero elements at the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill the remaining positions with zeroes
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna