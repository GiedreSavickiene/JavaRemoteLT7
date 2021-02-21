package imput_output.file_write;

import imput_output.InputOutbutUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        //turi buti try ir catch blokose
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(InputOutbutUtils.RESULT_FILELOCATION))) {
            String text = "Siandien yra sekmadienis";
            bufferedWriter.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


