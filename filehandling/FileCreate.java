//package filehandling;
import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) throws IOException {    
    File file=new File("C:\\Users\\gaura\\OneDrive\\Desktop\\mytext.txt");
    if(file.exists())
    {
        System.out.println("Already Exist");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println("Bytes:"+file.length());
    }
    else
    {
      System.out.println("Not Exist");
      if(file.createNewFile())
      {
        System.out.println("File Created successfully");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println("Bytes:"+file.length());
      }
      else
      {
        System.out.println("Something went wrong");
      }
    }
        
    }
}
