class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int max1 = 0 ;
         int n = nums.length;

         for(int i=0 ; i<n;i++){
            if(nums[i]==1){
                cnt++;
                max1 = Math.max(max1,cnt);
            }
            else{
               cnt = 0; 
            }
         }
         return max1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna