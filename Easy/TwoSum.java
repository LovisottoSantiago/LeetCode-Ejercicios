



public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Two Sum");
        /*int[] numbers = {2, 7, 11, 15};
        int target = 9;*/

        int[] numbers = {3, 3, 6};
        int target = 9;

        int[] newList = TwoSum(numbers, target);
        System.out.println("[" + newList[0] + ", " + newList[1] + "].");
    }

    // Given an array of integers numbers and an integer target, return indices of the two numbers such that they add up to target.
    // You may assume that each input would have exactly one solution, and you may not use the same element twice.

    //Example
    //Input: numbers = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because numbers[0] + numbers[1] == 9, we return [0, 1].

    public static int[] TwoSum(int[] numbers, int target){
        int[] list = new int[2];
        
        for (int i=0; i < numbers.length -1; i++) {
            for (int j=i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    list[0] = i;
                    list[1] = j;
                    return list;
                }
            }
        }
        return list;
    }
    // Due to these are nested loops, the time complexity is O(n x n) = O(n^2)
    // Solution, use HashMap.



}
