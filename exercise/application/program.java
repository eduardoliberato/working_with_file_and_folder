package exercise.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercise.entities.product;

public class program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<product> list = new ArrayList<>();

        System.out.println("Enter file path: "); // path:
                                                 
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent(); // take just the path, without the file name

        boolean success = new File(sourceFolderStr + "\\out").mkdir(); // to create a folder with the name out

        String targetFileStr = sourceFolderStr + "\\out\\sumary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new product(name, price, quantity));

                itemCsv = br.readLine();

            }
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){

                for(product item: list){
                    bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + " CREATED");
            } catch(IOException e ){
                    System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        sc.close();

    }

}
