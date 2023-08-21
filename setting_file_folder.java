import java.io.File;
import java.util.Scanner;

public class setting_file_folder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory); //create a array with the name of the path of the folders

        System.out.println("FOLDERS:");

        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile); //create a array with the name of the path of the files

        System.out.println("FILES:");

        for (File file : files) {
            System.out.println(file);
        }

        //it is going to create a new folder:
        boolean success = new File(strPath + "\\new_folder").mkdir();
        System.out.println("Directory created successfully: " + success);
        sc.close();
    }
}
