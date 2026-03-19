import java.io.*;
import java.net.*;
public class Client {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 5000;
        try (Socket socket = new Socket(host, port)) {
            System.out.println("Connected to server");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverInput = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            new Thread(()->{
                try {
                    String msg;
                    while ((msg = serverInput.readLine()) != null) {
                        System.out.println(msg);
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server");
                }
            }).start();
            String userInput;
            while ((userInput = input.readLine()) != null) {
                out.println(userInput);
            }

        } catch (IOException e) {
            System.out.println("Client error:");
            e.printStackTrace();
        }
    }
}
