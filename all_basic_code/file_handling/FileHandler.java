package file_handling;
import java.io.write;
import java.io.append;
import java.io.File;
public class FileHandler {
    public static void main(String[] args) {
        File file = new File("all_basic_code/file_handling/name.txt");
        // System.out.println(file.canWrite());
        file.write("hello world");
        file.append(" welcome to java programming");
        System.out.println(file.length());
    }
}