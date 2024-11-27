class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        String mergedString = mergeAlternately(word1, word2);
        System.out.println(mergedString);
    }
     public static String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }
        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }
        return merged.toString();
        }
    }