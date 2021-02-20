package colection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pokemons = new PriorityQueue<>();

        //offer - idedam ir dedam i eiles gala
        pokemons.offer("Charmander");
        pokemons.offer("Pikachu");

        //ziurim kas yra musu eiles virsuje
        System.out.println(pokemons.peek());
        //isimti is eiles.poll visada isims tik pirma eileje, is vidurio
        //isimti negali
        System.out.println(pokemons.poll());
        System.out.println(pokemons.peek());

    }
}
