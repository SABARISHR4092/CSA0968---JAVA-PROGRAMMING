import java.io.FileReader;

class FileReaderDemo {
    public static void main(String[] args) {

        try {
            FileReader fr =
                    new FileReader("charfile.txt");

            int ch;

            System.out.println("Reading File:");

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
