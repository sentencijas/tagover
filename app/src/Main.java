package src;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws Exception {
        int port = 9090;
        ServerSocket server = new ServerSocket(port);
        System.out.println("Listening on port " + port);
        while (true) {
            try (Socket client = server.accept()) {
                OutputStream out = client.getOutputStream();
                String response = "HTTP/1.1 200 OK\r\nContent-Length: 2\r\n\r\nok";
                out.write(response.getBytes());
                out.flush();
            }
        }
    }
}
