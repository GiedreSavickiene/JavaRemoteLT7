package polimorphism;

public class PolimorphismExampleMain {
        //Polimorfizm
    public static void main(String[] args) {
        RemoteControle remote = new TvRemoteControler();
        remote.enable(true);
        System.out.println(remote.getClass().getSimpleName());

        remote = new AcRemoteControler();
        System.out.println(remote.getClass().getSimpleName());

        TvRemoteControler tvRemoteControler = new TvRemoteControler();
        AcRemoteControler acRemoteControler = new AcRemoteControler();

    //      printTvObject(acRemoteControler);
    //     printAcObject(tvRemoteControler);

        printRemoteControlerObject(tvRemoteControler);
        printRemoteControlerObject(acRemoteControler);
        printRemoteControlerObject(remote);

    }
    //priema tik viena remote
    private static void printTvObject(TvRemoteControler tv){
        System.out.println(tv.getClass().getSimpleName());

    }
    //priema tik viena remote
    private static void printAcObject(AcRemoteControler ac){
        System.out.println(ac.getClass().getSimpleName());

    }
    //priema abu objektus remote
    private static void printRemoteControlerObject(RemoteControle remote) {
        System.out.println(remote.getClass().getSimpleName());
    }


}
