package anotation.deptricated;

import java.util.List;

public class Calculator {

    //sudes du skaicius
    //anotacija @Depricated pasako, kad sis metodas ilgainiui bus pasalintair
    //naujesneje versijoje jos nebebus
    //galima @Depricated buti ir klaseje
    @Deprecated
    public int sum (int firstNum, int secondNum){
        return firstNum + secondNum;
    }
    //sudes visus sarase esancius skaitmenis
    public int sum(List<Integer> numbers) {
        int result = 0;

        for (Integer number : numbers) {
            result += number;
        }
        return result;

    }
}
