package baseline;

public class Solution42 {
    public static void main(String[] args) {
        DataParsing parser = new DataParsing();
        parser.readData(".\\data\\exercise42_input.txt");
        parser.printData();
        parser.writeData(".\\data\\exercise42_output.txt");
    }
}
