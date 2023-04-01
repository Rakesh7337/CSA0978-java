import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileStatistics {

    public static void main(String[] args) {
        String fileName = "File1.txt";
        int wordCount = 0;
        int charCount = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                String[] words = line.split("\\s+");
                wordCount += words.length;
                for (String word : words) {
                    charCount += word.length();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File name: " + fileName);
        System.out.println("Word count: " + wordCount);
        System.out.println("Character count: " + charCount);
        System.out.println("Line count: " + lineCount);
    }
}
