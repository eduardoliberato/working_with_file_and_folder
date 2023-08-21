import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file_buffer_reader {

    public static void main(String[] args) {
        
        String path = "C:\\Users\\davi0\\Desktop\\2023\\JAVA\\visual_studio\\working_with_file\\application\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine(); //request to read one line  

            while (line != null){
                System.out.println(line); // if there is anything in the line, it will print it, then read the next line
                line = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            try{
                           
                if (br != null){
                br.close();
            }
                if (fr != null){
                fr.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
    }

}
