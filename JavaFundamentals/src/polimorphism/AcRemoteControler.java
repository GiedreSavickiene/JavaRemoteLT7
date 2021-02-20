package polimorphism;

public class AcRemoteControler implements RemoteControle{
    @Override
    public void enable(boolean action) {
        System.out.println("Turning Air conditioning ON");

    }
}
