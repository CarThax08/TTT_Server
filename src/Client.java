import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client implements ThreadedObject{
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    char player;
    public Client(Socket s, char player){
        socket = s;
        this.player = player;
        try {
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void run() {
        String received;
        boolean running = true;
        try{
            received = dis.readUTF();
            switch (received.substring(0, 3)){
                case "set":
                    String space = received.substring(2);
                    int x = Integer.parseInt(space.split(",")[0]);
                    int y = Integer.parseInt(space.split(",")[1]);

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
