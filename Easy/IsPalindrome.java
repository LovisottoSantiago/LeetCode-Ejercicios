public class IsPalindrome {
    
    public static void main(String[] args){
        System.out.println(IsPalindromeMethod("A man, a plan, a canal: Panama"));
    }

    public static boolean IsPalindromeMethod(String s){
        s = s.trim().toLowerCase().replaceAll("[^a-z0-9]", "");
        int last = s.length() - 1;
        
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) != s.charAt(last)){
                return false;
            }
            last -= 1;
        }

        return true;        
    }
    // Runtime: 14ms.
    // Time Complexity: O(n).

}
