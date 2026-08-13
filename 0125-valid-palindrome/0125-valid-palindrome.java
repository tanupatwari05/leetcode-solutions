class Solution {

    public boolean isPalindrome(String s, int i) {

        // Base case
        if (i >= s.length() / 2) {
            return true;
        }

        // Compare left and right characters
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }

        // Recursive call
        return isPalindrome(s, i + 1);
    }

    public boolean isPalindrome(String s) {

        // Remove non-alphanumeric characters
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return isPalindrome(s, 0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna