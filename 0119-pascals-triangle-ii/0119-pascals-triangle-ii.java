class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        
        // 2. Changed 'row' to 'rowIndex' to match the method parameter
        for (int col = 1; col <= rowIndex; col++) {
            ans = ans * (rowIndex - (col - 1));
            ans = ans / col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna