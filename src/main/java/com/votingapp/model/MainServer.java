package com.votingapp.model;
public class MainServer {
    public static void main(String[] args) {
        VotingServer server = new VotingServer(8080);
        server.startServer();
    }
}
