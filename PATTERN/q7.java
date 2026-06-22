import java.io.IOException;

class Processor {
    void readFile() throws IOException {
        throw new IOException("File not found");
    }

    void process() {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class q7 {
    public static void main(String[] args) {
        Processor p = new Processor();
        p.process();
    }
}