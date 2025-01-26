package Leetcode.Microsoft;

public class Regular_Expression_Matching_10 {

    class Solution {
        public static boolean isMatch(String input_string, String pattern) {
            return input_string.matches(pattern);
        }
    }

    public static void main(String[] args) {

        String input_string = "";
        String pattern = "";

        System.out.println("Answer is --> "+ Solution.isMatch(input_string, pattern));

    }
}
