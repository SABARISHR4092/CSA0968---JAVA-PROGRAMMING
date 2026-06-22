import java.io.FileOutputStream;

class FileOutputDemo {
    public static void main(String[] args) {

        try {
            FileOutputStream fos =
                    new FileOutputStream("bytefile.txt");

            String msg = "Java File Output Stream";

            fos.write(msg.getBytes());

            fos.close();

            System.out.println("Data Written Successfully");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}