package trywithresource;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class TryWithResourceDemo {
    public static void main(String[] args) throws IOException {
        try (PrintWriter writer = new PrintWriter(new File("C:\\Users\\gaura\\OneDrive\\Desktop\\test.txt"))) {
            writer.println("Hello World");
        }
    }
}
