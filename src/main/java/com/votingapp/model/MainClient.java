package com.votingapp.model;
public class MainClient {
    public static void main(String[] args) {
        Node node = new Node("NODE-001", "localhost", 8080);
        node.connectAndSendCommand("VOTE: CANDIDATE_A");
    }
}
