package nio;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoryDemo {
    public static void main(String[] args) throws IOException {

        Path target=Paths.get("D:/NIO");
        Files.createDirectories(target);
        
    }
}
