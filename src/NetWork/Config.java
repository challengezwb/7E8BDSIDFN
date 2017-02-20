package NetWork;

import java.io.*;

/**
 * Created by zhupd on 2/19/2017.
 */
public class Config {
    int NumberOfPreferedNeighbors;
    int UnchokinInterval;
    int OptUnchockingInterval;
    String FileName;
    int FileSize;
    int PieceSize;
    PeerInfo[] peerInfo;

    Config() throws IOException{
        readCommon();
        readPeerInfo();
    }

    void readCommon() throws IOException{
        File file = new File("Common.cfg");
        InputStreamReader reader =
                new InputStreamReader(new FileInputStream(file));
        BufferedReader br = new BufferedReader(reader);


        NumberOfPreferedNeighbors=
                Integer.parseInt(br.readLine().split(" ")[1]);

        UnchokinInterval=
                Integer.parseInt(br.readLine().split(" ")[1]);

        OptUnchockingInterval=
                Integer.parseInt(br.readLine().split(" ")[1]);

        FileName=
                br.readLine().split(" ")[1];

        FileSize=
                Integer.parseInt(br.readLine().split(" ")[1]);

        PieceSize=
                Integer.parseInt(br.readLine().split(" ")[1]);

    }

    void readPeerInfo() throws  IOException {
        File file = new File("PeerInfo.cfg");
        InputStreamReader reader =
                new InputStreamReader(new FileInputStream(file));
        BufferedReader br = new BufferedReader(reader);
        String temp=br.readLine();
        int i=0;
        while (!temp.isEmpty()) {
            String[] str = temp.split(" ");
             peerInfo[i++] = new PeerInfo(str);
            temp=br.readLine();
        }
    }

}

class PeerInfo {
    int ID;
    String IP;
    int port;
    boolean haveFile;

    PeerInfo(String[] strings) {
        ID = Integer.parseInt(strings[0]);
        IP=strings[1];
        port = Integer.parseInt(strings[2]);
        haveFile= Integer.parseInt(strings[3])==1 ? true:false;
    }
}