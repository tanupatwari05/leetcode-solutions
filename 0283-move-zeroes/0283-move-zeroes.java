class Solution {
    public void moveZeroes(int[] nums) {

        // optimal solution 

        int n = nums.length;
        // step-1  find the zeorth element 
        int j = -1; 
        for(int i = 0;i<n;i++){
            if(nums[i]== 0){
                j=i;
                break;
            }

        }
        // if there is no zero array is laready correct 
         if( j == -1) {
            return;
         } 
         // for non zero no in array (shifting them in before)
        for(int i = j+1;i<n;i++){
            if(nums[i]!= 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp ;
            
            
            j++;
            }
        }
    }
}
//         // brute force approach 
//         // step 1  taking out non zero nums from the array 
    
//         int n = nums.length;
//         int [] temp = new int [n] ;
//          int index = 0;

//         for(int i = 0; i<n;i++){
//             if(nums[i]!=0){
//                 temp[index]= nums[i];
//                 index++;
//             }
//         }
//         // step 2  add temp arr into original nums 

//          for(int i = 0 ;i< index;i++){
//             nums[i] = temp[i];
//         }

//         // step 3  add zeroes  at the end of the arrray 

//         for(int i = index ;i<n;i++){
//             nums[i] = 0;
//         }
//     }
// }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna