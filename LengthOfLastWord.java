import java.util.Scanner;
class Solution {
      public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int length = lengthOfLastWord(s);
        System.out.println("Length of the last word: " + length);
      }
      public static int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        return s.length() - lastSpaceIndex - 1;
         }
    }