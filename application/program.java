package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\davi0\\Desktop\\2023\\JAVA\\visual_studio\\working_with_file\\application\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            // scanner can't be null, because it means he was not instaciated and already gave an exception 
            if (sc != null){
                sc.close();
            }
        }
        
    }
}