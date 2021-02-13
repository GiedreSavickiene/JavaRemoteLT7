package animal.example;

public class Dog extends Animal {


    public Dog(String breed,String voice, boolean mammal) {
        super(voice, mammal);

    }
    public String yieldVoice() {
        return "Cat voice: " + voice;

    }
}
