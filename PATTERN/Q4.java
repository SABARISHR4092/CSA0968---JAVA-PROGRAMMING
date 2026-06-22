import java.io.FileWriter;

class FileWriterDemo {
    public static void main(String[] args) {

        try {
            FileWriter fw =
                    new FileWriter("charfile.txt");

            fw.write("Java File Writer Example");

            fw.close();

            System.out.println("Data Written Successfully");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
