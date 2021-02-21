package imput_output.file_read.buffered_reader;

import imput_output.InputOutbutUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuferedReaderExample2 {


    public static void main(String[] args) {
        //galima uzdaryti tokiu budu:atidaryti try sklaiustelius ir tenai sukurti objekta su konstruktorium.
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(InputOutbutUtils.DATA_FILE_LOCATION));) {

            String line = bufferedReader.readLine();

            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

            //tada nebereikia rasyti sito: Java tada uzdaro
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nebuvo rastas pagal nurodyta kelia: ");
            System.out.println(ex.getMessage());
        } catch (IOException ex){
            System.out.println("Blogas failo formatas");
            System.out.println(ex.getMessage());
        }


    }
}


