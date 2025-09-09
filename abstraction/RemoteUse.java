//package abstraction;

public class RemoteUse {
    public static void main(String[] args){
        Remote remote = new TVRemote();
        remote.TVoff();
        remote.TVon();
    }
}
