import java.io.File;
public class FileList {
    public static void main(String[] args) {

        File myfile=new File("C:\\Users\\gaura\\OneDrive\\Desktop\\data");

        String filelist[]=myfile.list();

        for (String i : filelist) {
            System.out.println(i);
        }
        
    }
}
