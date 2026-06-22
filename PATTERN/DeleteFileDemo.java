import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {

        File file = new File("newfile.txt");

        if (file.delete()) {
            System.out.println("File Deleted Successfully");
        } else {
            System.out.println("Deletion Failed");
        }
    }
}