import java.io.File;
import java.util.Scanner;

public class path {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getPath: " + path.getPath()); //return the path of the file with the name
        System.out.println("getParent: " + path.getParent()); //return the path without the name of the file
        System.out.println("getName: " + path.getName()); // return only the name of the file 

        sc.close();
    }
}
