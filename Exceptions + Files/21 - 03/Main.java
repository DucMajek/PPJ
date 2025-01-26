import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\PJATK\\PPJ\\PPJ_zadania\\src\\test.txt";

        int[] characterCounts = new int[256];

        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            int byteRead;

            while ((byteRead = fileInputStream.read()) != -1) {
                characterCounts[byteRead]++;
            }

            System.out.println("Character frequencies:");
            for (int i = 0; i < characterCounts.length; i++) {
                if (characterCounts[i] > 0) {
                    System.out.println("Character: '" + (char) i + "' - Count: " + characterCounts[i]);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
