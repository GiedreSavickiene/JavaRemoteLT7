package imput_output.file_read.buffered_reader;

import imput_output.InputOutbutUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuferReaderExample {


    public static void main(String[] args) {
        try {
            //paima faila is nurodytos lokacijos
            FileReader fileReader = new FileReader(InputOutbutUtils.DATA_FILE_LOCATION);
            //musu duomenu failo contenta is nuliuku ir dvejetuku pavercia i skaitoma teksta
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            do {
                line = bufferedReader.readLine();
                if(line!=null)
                System.out.println(line);
            }while (line!=null);

            //turim butinai uzdaryti:
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nebuvo rastas pagal nurodyta kelia: " );
            System.out.println(ex.getMessage());
        } catch (IOException ex){
            System.out.println("Blogas failo formatas");
            System.out.println(ex.getMessage());
        }


    }
}
