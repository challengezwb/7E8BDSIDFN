package NetWork;

import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by zhupd on 2/19/2017.
 */
public class PeerState {
    //<ID, statelist>
    HashMap<Integer, onePeerState> stateMap = new HashMap<>();
    ArrayList<Integer> preferedNeighbors;
    int optNeighbor;
    ArrayList<Integer> previousNeighbor;


    /**
     * unchoke interval
     */
    void reSelectPreferNeighbors() {
        //select k by uploadSpeed;
        //if file completely download, randomly chose k

        ArrayList<Integer> UnchokeList=null;
        ArrayList<Integer> ChokeList=null;

        //

        sendChoke(ChokeList);
        sendUnchoke(UnchokeList);
    }

    void sendUnchoke(ArrayList<Integer> list) {

    }

    void sendChoke(ArrayList<Integer> list) {

    }


    /**
     * opt unchoke internal
     */
    void reSelectOptNeighbor() {
        //interested && choke
        //randomly chose one
        ArrayList<Integer> Optlist=null;
        int previousOpt=optNeighbor;
        optNeighbor=0;//todo



        sendChoke(new ArrayList<>(previousOpt));
        sendUnchoke(new ArrayList<>(optNeighbor));

    }






}

class onePeerState {
    int ID;
    Socket socket;
    int uploadSpeed;
    private BitField bitField;
    public boolean isInterested;
    public boolean isChock;

    void updateBitField(ActualMsg msg) {
        //msg: piece/type
        //according msg type to update bitfield.
    }

}
