class Solution {
    public int missingNumber(int[] nums) {
        // by xor 
        int n = nums.length;
         int xor1 = 0;
         int xor2 = 0;
         for(int i = 0;i<n;i++){
            xor2 = xor2^nums[i];
            xor1 = xor1^i;
         }
                     xor1= xor1^n;

         return xor1^xor2;


    }
}
        // // by summing 
        // int sum = (nums.length*(nums.length+1))/2 ;

        //  int s2 = 0;
        //   for(int i = 0;i<nums.length;i++){
        //     s2+=nums[i];
        //   }
          
        //   return sum - s2;
    


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna