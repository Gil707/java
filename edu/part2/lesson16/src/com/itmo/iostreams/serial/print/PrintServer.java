package com.itmo.iostreams.serial.print;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xmitya on 28.08.16.
 */
public class PrintServer {

    String data = new String("Message recieved");

    private final String LOG = "D:\\work\\java\\edu\\part2\\lesson16\\src\\com\\itmo\\iostreams\\serial\\print\\log.txt";
    private int port;

    private SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss.SSS");

    public PrintServer(int port) {
        this.port = port;
    }

    private void start() throws IOException {
        try (ServerSocket ssocket = new ServerSocket(port)) {
            System.out.println("Server started on " + ssocket);

            while (true) {
                Socket sock = ssocket.accept();

                try {
                    process(sock);
                }
                catch (ClassNotFoundException e) {
                    System.err.println("Wrong message was received");

                    e.printStackTrace();
                }
                finally {
                    sock.close();
                }
            }
        }
    }

    private void process(Socket sock) throws IOException, ClassNotFoundException {
        String host = sock.getInetAddress().getHostAddress();

        try (ObjectInputStream objIn = new ObjectInputStream(sock.getInputStream());
             ObjectOutputStream out = new ObjectOutputStream(sock.getOutputStream())) {
            Object obj = objIn.readObject();

            printMessage((Message) obj, host);
            writeToLog((Message) obj, host);
            out.writeObject(data); // отправляем клиенту ответ

        }
        catch (IOException | ClassNotFoundException | RuntimeException e) {
            System.err.println("Failed process connection from: " + host);

            e.printStackTrace();

            throw e;
        }
    }

    private void printMessage(Message msg, String senderAddr) {
                System.out.printf("%s (%s) at %s wrote: %s\n", msg.getSender(), senderAddr, format.format(new Date(msg.getTimestamp())), msg.getText());
    }

    public void writeToLog(Message msg, String senderAddr) throws IOException {

        // открываем поток ввода в файл
        FileWriter fileWriter = new FileWriter(LOG, true);

        // записываем данные в файл, но
        // пока еще данные не попадут в файл,
        // а просто будут в памяти
        StringBuilder line = new StringBuilder();
        line.append("Name: ").append(msg.getSender()).append(" Address: ").append(senderAddr).append(" Date: ").append(format.format(new Date(msg.getTimestamp()))).append(" Message: ").append(msg.getText());
        fileWriter.write(line.toString() + "\n");
        fileWriter.close();

    }


    public static void main(String[] args) throws IOException {
        if (args == null || args.length == 0)
            throw new IllegalArgumentException("Port must be specified");

        int port = Integer.parseInt(args[0]);

        PrintServer printServer = new PrintServer(port);

        printServer.start();
    }
}
