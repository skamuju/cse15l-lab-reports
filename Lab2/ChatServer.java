import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {

    String chatLog = "";

    public String handleRequest(URI url) {

        if (url.getPath().equals("/add-message")) {
            String[] params = url.getQuery().split("&");
            String message = params[0].split("=")[1];
            String username = params[1].split("=")[1];
            chatLog += username + ": " + message + "\n\n";
            return chatLog;

        } else if (url.getPath().equals("/jello")){
            return "jello";
        } else {
            return "404 Not Found!";
        }
    }
}

class ChatServer {
    public static void main(String[] args) throws IOException {

        int port = Integer.parseInt(args[0]);
        Server.start(port, new Handler());
    }
} 
    

