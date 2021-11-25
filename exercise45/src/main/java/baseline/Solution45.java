package baseline;

import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) {
        WordFinder w = new WordFinder();
        w.readFile();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        w.writeFile(input.next());
    }
}
