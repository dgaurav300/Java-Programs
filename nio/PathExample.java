package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

class PathExample{

    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\gaura\\OneDrive\\Desktop\\Java Assessment Question.pdf");

        System.out.println(path.getFileName());
        System.out.println(path.getFileSystem());
        System.out.println(path.getNameCount());
        System.out.println(path.getName(2));
        System.out.println(path.getParent());
        System.out.println(path.getRoot());

        System.out.println(path.isAbsolute());



    }
}