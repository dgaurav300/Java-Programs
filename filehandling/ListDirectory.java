//package filehandling;
import java.io.File;
import java.io.IOException;

public class ListDirectory {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\gaura\\OneDrive\\Desktop\\New Folder");
        String[] list=file.list();

        //file.mkdir();
        file.delete();
        //System.out.println("Number of files on desktop:"+list.length);
        /*for(String i:list)
        {
            System.out.println(i);
        }
        */
        
    }
    
}
