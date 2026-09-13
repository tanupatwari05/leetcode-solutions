class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums); 

        int n = nums.length;

        // optimal solution 
         int [][] numsWithIndex = new int [n][2];
         for(int i = 0;i<n;i++){
            numsWithIndex[i][0] = nums[i];
            numsWithIndex[i][1] = i ;
        }

        Arrays.sort(numsWithIndex , (a,b) -> Integer.compare(a[0],b[0]));

         int left = 0 ;
         int right = n-1;

         while(right> left ){
            int currSum = numsWithIndex[left][0] +numsWithIndex[right][0];
            if(currSum<target){
                left++;
            }else if(currSum>target){
                right--;
            } else{
                return  new int []{numsWithIndex[left][1],numsWithIndex[right][1]};
            }
         }
            return new int[]{};
         
    }
}



















        // better hashing solution 
//         HashMap<Integer, Integer>  store = new HashMap<>();

//          for(int i = 0;i<n;i++){
//             int firstEle = nums[i];
//             int secondOne = target - firstEle ;
//             if(store.containsKey(secondOne)){
//                 return new int [] {store.get(secondOne),i };
//             }
//             store.put(firstEle,i) ;
//          }
//             return new int [] {};
//          }
// }



        //brute force approach 
//         for(int i = 0;i<n; i++){
//             for(int j = i+1;i<n;i++){
//                 if(nums[i]+nums[j]==target){
//                     return new int []{i,j};
//                 }
//             }
//         }
//             return new int [] {};
        
//     }
// }





// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna