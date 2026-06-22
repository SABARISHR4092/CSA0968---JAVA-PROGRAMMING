import java.io.File;

public class RenameFileDemo {
    public static void main(String[] args) {

        File oldFile = new File("sample.txt");
        File newFile = new File("newfile.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File Renamed Successfully");
        } else {
            System.out.println("Rename Failed");
        }
    }
}