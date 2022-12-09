package com.internet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {

    String[] adviceList = {"Take smaller bites.",
        "Go for the tight jeans. NO they do NOT make you look fat.", "One word: inappropriate",
        "Just for today, be honest. Tell your boss what you *really* think.",
        "You might want to rethink that haircut."};
    ServerSocket server;
    Socket socket;

    public void go() {
        try {
            server = new ServerSocket(4242);
            while (true) {
                socket = server.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

}
