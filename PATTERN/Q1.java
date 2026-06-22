import java.io.FileInputStream;

class FileInputDemo {
    public static void main(String[] args) {

        try {
            FileInputStream fis =
                    new FileInputStream("bytefile.txt");

            int ch;

            System.out.println("Reading File:");

            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }

            fis.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}