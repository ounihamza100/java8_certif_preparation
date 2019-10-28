import java.io.File;
import java.io.FileFilter;

/**
 * @author Hamza Ouni
 */
public class LambdaFileFilterExample {

    public static void main(String[] args) {

        File dir = new File("C:\\Users\\ho\\.m2\\repository\\org\\springframework\\boot\\spring-boot");

        // Filter sub-directories using anonymous class
        File[] subDirectories = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });

        System.out.println("-------------Using anonymous class------------");
        for (File file : subDirectories) {
            System.out.println(file.getName());
        }

        // Filter sub-directories using Lambda expression

        FileFilter f = (file) ->  file.isFile() && file.getName().endsWith(".class") || file.isDirectory() ;

        File[] subDirectories2 =  dir.listFiles(f);
        System.out.println("-------------Using anonymous class2------------");
        for (File file : subDirectories2) {
            System.out.println(file.getName());
        }







    }
}
