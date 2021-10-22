import java.util.*;
class Xpattern {
    static void x_pattern(String str, int len) {
        System.out.println("The X pattern of the word is : ");
        System.out.println("");
        for (int i = 0; i < len; i++) {
            int j = len - 1 - i;
            // System.out.println(j);
            for (int k = 0; k < len; k++) {
                if (k == i || k == j) {
                    System.out.print(str.charAt(k));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an odd String : [ eg: PROGRAM ] \n");
        System.out.print(">> ");
        String word = s.nextLine().toUpperCase();
        System.out.println("");
        x_pattern(word, word.length());
    }
}
