package generics.genericInterface;

public class Motorcycle implements Comparable<Motorcycle> {



    @Override
    public int compareTo(Motorcycle object) {
        return 0;
    }

    @Override
    public Motorcycle getObjec() {
        return this;
    }
}
