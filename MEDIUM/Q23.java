import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

 class FileReadWriteDemo {

    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("sample.txt");

            fw.write("Computer Science and Engineering");

            fw.close();

            FileReader fr = new FileReader("sample.txt");

            int ch;

            System.out.print("File Content: ");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}