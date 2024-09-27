public class IsPowerOfTwo {
 
    public static void main(String[] args){

        System.out.println(isPowerOfTwoMethod(1048576));
        System.out.println(isPowerOfTwoMethod(1048573));
        
    }

    public static boolean isPowerOfTwoMethod(int n){
        if (n <= 0) {
            return false;
        }
        // AND operation, number 6.
        // n = 6 --> 0110
        // n-1=5 --> 0101
        // AND   --> 0100 --> return 1.
        return (n & (n - 1)) == 0;
    }
    // Runtime = 0ms.
    // Time Complexity = O(1).
}
