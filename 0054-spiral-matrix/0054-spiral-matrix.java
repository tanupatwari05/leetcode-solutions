class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
                List<Integer> ans = new ArrayList<>();


        if(matrix == null || matrix.length== 0|| matrix[0].length == 0){
            return ans;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0; int right = n-1;
        int top = 0 ; int bottom = m-1;
        while(left<= right && top<= bottom){
        // left to right top is constant
        for( int i = left;i<=right;i++){
            ans.add(matrix[top][i]);
        } 
        top++;
        //  top to bottom right is constant
        for(int i = top; i<=bottom;i++){
            ans.add(matrix[i][right]);
        }
        right--;
        if(top<= bottom){
        // right to left  bottom is constant
        for(int i = right; i>=left;i--){
            ans.add(matrix[bottom][i]);
        }
        bottom--;
        }

        if(left<=right){
        //bottom to top left is constant
        for(int i = bottom; i>=top;i--){
            ans.add(matrix[i][left]);
        }
        left++;
        }
    }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna