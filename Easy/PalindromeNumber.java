
import java.util.ArrayList;



public class PalindromeNumber{

    public static void main(String[] args) {
        int number = 1250521;

        String output;
        if(isPalindrome(number)){
            output = number + " is palindrome.";
        }
        else{
            output = number + " is not palindrome.";
        }
        System.out.println("Output: " + output);
    }
    
    public static boolean isPalindrome(int number){
        ArrayList<Integer> list = new ArrayList<>();
        int originalNum = number; // save the original num

        while (number > 0){
            int last = number % 10; // get the last digit       
            list.add(last);
            number /= 10; // remove the last digit
        }

        int result = 0;
        for (int x : list) {
            result = result * 10 + x;
        }

        return result == originalNum;
    } 
    // Time complexity = O(log₁₀(n)).
    // Runtime: 6ms.
}