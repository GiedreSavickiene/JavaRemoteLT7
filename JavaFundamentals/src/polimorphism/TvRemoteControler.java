package polimorphism;

public class TvRemoteControler implements RemoteControle{
    @Override
    public void enable(boolean action) {
        if(action) {
            System.out.println("Turning TV on");
        }else {
            System.out.println("Turning TV off");
        }
    }
}
