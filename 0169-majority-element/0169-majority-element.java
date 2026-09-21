class Solution {
    public int majorityElement(int[] nums) {
            // moove's voting algo 

            int cnt = 0;
            int el  = 0;
            for(int i = 0;i<nums.length;i++){
                if(cnt == 0){
                    cnt = 1;
                    el = nums[i];
                }
                else if(nums[i] == el){
                  cnt++;  
                }else{
                    cnt--;
                }
            }
             int cnt1 = 0;
            for(int i = 0;i<nums.length;i++){
                if(nums[i] == el){
                    cnt1++;
                }
                if(cnt1 > nums.length/2){
                    return el ;
                }
            }
                return -1;
            
    }
}













//         int n = nums.length;
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i = 0;i<n;i++){
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

//         }
//                 for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             if (entry.getValue() > n / 2) {
//                 return entry.getKey();

//             }
//                 }
//         return -1;
//     }
// }
    


































        // brute force approach 
//         int n = nums.length;
//         for(int i = 0;i<n;i++){
//             int cnt = 0;
//             for(int j = 0;j<n;j++){
//                 if(nums[j]==nums[i]){
//                     cnt++;
//                 }
//                 if(cnt > n/2){
//                     return nums[i];
//                 }
//             }
//         }
//         return -1;
//     }

// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna