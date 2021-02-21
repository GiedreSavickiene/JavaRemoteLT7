package imput_output.file_read.scaner_reader;

import imput_output.InputOutbutUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScanerReaderExample {


    public static void main(String[] args) {
        //turi buti aprasytas try bloke
        try(Scanner scanner = new Scanner(new File(InputOutbutUtils.DATA_FILE_LOCATION))){
            //ar sekanti eilute nera null tai pasako metodas .hasNext
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException ex) {
            System.out.println("Blogas failo formatas arba failas nebuvo rastas");
            System.out.println(ex.getMessage());
        }
    }

}
