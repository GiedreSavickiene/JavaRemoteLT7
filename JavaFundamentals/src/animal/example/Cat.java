package animal.example;

public class Cat extends Animal{

    private String color;


    public  Cat(String color, String vois, boolean mammal) {
        super(vois,mammal);
        this.color = color;


    }
    public String yielsVoice(){
        return "Cat voice: " + voice;
    }

    @Override
    public String yieldVoice() {
        return null;
    }
}
