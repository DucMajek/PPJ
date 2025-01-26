import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        try {
            String line;
            String[] words;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s+");
                words = new String[data.length];
                for (int i = 0; i < data.length; i++) {
                    words[i] = data[i];
                }
                for (int i = 0; i < words.length; i++) {
                    if (words[i] != null) {
                        bw.write(words[i]);
                        bw.newLine();
                    }
                }
            }


        } catch (Exception e) {
            System.out.println(e);
        } finally {
            bw.close();
        }
    }
}
