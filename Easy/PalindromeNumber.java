

public class PalindromeNumber{

    public static void main(String[] args) {
        int number = 121;

        String output;
        if(isPalindrome){
            output = number + "is palindrome.";
        }
        else{
            output = number + "is not palindrome.";
        }
        System.out.println("This is the output: " + output);
    }
    
    public static boolean isPalindrome(int number){
        while (number > 0){
            int last = number % 10; // get the last digit          
            number /= 10; // remove the last digit
        }


        return true;
    } 

}