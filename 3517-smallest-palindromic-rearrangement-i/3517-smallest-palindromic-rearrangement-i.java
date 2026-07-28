class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        StringBuilder firstHalf = new StringBuilder();
        char middle = '\0';

        // Build the first half
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i] / 2; j++) {
                firstHalf.append((char) ('a' + i));
            }

            if (freq[i] % 2 == 1) {
                middle = (char) ('a' + i);
            }
        }

        StringBuilder secondHalf = new StringBuilder(firstHalf);
        secondHalf.reverse();

        if (middle != '\0') {
            return firstHalf.toString() + middle + secondHalf.toString();
        }

        return firstHalf.toString() + secondHalf.toString();
    }
}