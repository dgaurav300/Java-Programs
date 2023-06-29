package nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ComparePathDemo {
    public static void main(String[] args) {
        Path target=Paths.get("D:/NIODemo/Hello.java");
Path comparePath=Paths.get("D:/NIODemo/Hello.java");
Path compareNewPath=Paths.get("D:/NIODemo/NIO/Hello.java");
System.out.println(comparePath.compareTo(target));
System.out.println(compareNewPath.compareTo(target));

    }
}
