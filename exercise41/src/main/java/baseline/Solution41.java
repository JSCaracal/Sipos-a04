package baseline;

import java.io.File;

public class Solution41 {
    public static void main(String[] args) {
        NameSorter nameList = new NameSorter();
        nameList.readNames("C:\\Users\\Joshua\\Documents\\COP3330\\Sipos-a04\\exercise41\\data\\exercise41_input.txt");
        nameList.sortNames();
        nameList.printNames();
        nameList.writeNames("C:\\Users\\Joshua\\Documents\\COP3330\\Sipos-a04\\exercise41\\data\\exercise41_output.txt");

    }
}
