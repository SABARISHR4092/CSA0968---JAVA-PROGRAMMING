import java.io.*;
 class FileCount {
    public static void main(String[] args) {
        int characters = 0;
        int words = 0;
        int lines = 0;
        try {
            BufferedReader br =
                    new BufferedReader(
                            new FileReader("sample.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();
                String[] w = line.split("\\s+");
                words += w.length;
            }
            br.close();
            System.out.println("Lines = " + lines);
            System.out.println("Words = " + words);
            System.out.println("Characters = " + characters);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}