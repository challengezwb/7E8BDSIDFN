package NetWork;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import static NetWork.ActualMsg.*;

/**
 * Created by zhupd on 2/18/2017.
 */
public class peerProcess  {
    Config config;
    PeerState peerState=new PeerState();
    int myID;


    /**
     * inputstream, read by fixed byte, first read message length,
     * then message type
     * then payload(defined by length)
     *
     */
    void run() throws IOException{
        config = new Config();
        PeerInfo peer = config.peerInfo[1];
        //read input stream
        Socket socket = new Socket(peer.IP, peer.port);

        InputStream in = new BufferedInputStream(socket.getInputStream());
        while (true) {
            byte[] msgLength = new byte[4];
            byte[] msgType=new byte[1];
            in.read(msgLength);
            in.read(msgType);

            if()
        }


    }

    void





    void receive(ActualMsg msg) {
        msgType type=msg.getType();
        switch (type) {
            case HAVE: {
               // peerState.stateMap.get(guestID).updateBitField(msg);

            }
            break;




        }
    }

}

enum TypeEnum {
    CHOKE((byte)0),
    UNCHOKE((byte)1),
    INTERESTED((byte)2),
    NOTINTERESTED((byte)3),
    HAVE((byte)4),
    BITFIELD((byte)5),
    REQUEST((byte)6),
    PIECE((byte)7);
    byte val=(byte)-1;

    TypeEnum(byte val) {
        this.val=val;
    }
}
