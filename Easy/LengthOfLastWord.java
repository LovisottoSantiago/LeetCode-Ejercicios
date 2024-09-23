//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.

public class LengthOfLastWord{

    public static void main(String[] args) {
        
        String words = "Hi, my name is Jorge";
        System.out.println(lengthOfLastWord(words));

    }

    public static int lengthOfLastWord(String s) {
        s = s.trim(); //leading and trailing spaces are removed.
        if (s.contains(" ")){
            int index = s.lastIndexOf(" ") + 1;
            return s.length() - index;
        }
        else { // if it doesn't have spaces, it's a entire word.
            return s.length();
        }
    }
    // Time complexity of O(n). Runtime = 0ms.
}