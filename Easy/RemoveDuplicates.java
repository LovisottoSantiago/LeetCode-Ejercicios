

/*
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores). 
*/

public class RemoveDuplicates{

    public static void main(String[] args){
        System.out.println("Hello world");
        int[] nums = {1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums);
        System.out.println(k);

        // Print the modified array up to k
        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums){
        if (nums.length == 0) return 0;  
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            //if (nums[i] == nums[j]) { 
                // if they're equals, just i++.
            //} 
            if (nums[i] != nums[i - 1]){
                nums[j] = nums[i];                
                j++;
            }
        }
        return j;
    }
    // Time complexity = O(n)
    // Runtime = 1ms.
}