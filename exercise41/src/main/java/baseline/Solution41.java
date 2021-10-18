package baseline;

import java.io.File;

public class Solution41 {
    public static void main(String[] args) {
        NameSorter nameList = new NameSorter();
        nameList.readNames(".\\data\\exercise41_input.txt");
        nameList.sortNames();
        nameList.printNames();
        nameList.writeNames(".\\data\\exercise41_output.txt");

    }
}
