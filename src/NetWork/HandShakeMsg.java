package NetWork;

/**
 * Created by zhupd on 2/18/2017.
 */
public class HandShakeMsg {
    final byte[] header="P2PFILESHARINGPROJ".getBytes();
    final byte[] zeroBit={0,0,0,0,0,0,0,0,0,0};
    int peerID;


    HandShakeMsg(int ID) {

    }

    void readMsg() {} //read handshake

    void sendMsg() {} //send handshake
}
