class Solution {
    public int singleNumber(int[] nums) {

        

        // optimal ans

        int xor = 0;
        for(int i = 0;i<nums.length;i++){
            xor= xor^nums[i];
        }
        return xor ;
    }
}


//         // brute force 
//         int n = nums.length;
//         for(int i = 0;i<n;i++){
//            int num = nums[i];
//             int cnt = 0;
//             for(int j = 0;j<n;j++){
//                 if(nums[j]==num){
//                     cnt++; 
//                 }
//             }
//         if(cnt == 1){
//         return num;
//         }
//     }
//         return -1;
//     }
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna