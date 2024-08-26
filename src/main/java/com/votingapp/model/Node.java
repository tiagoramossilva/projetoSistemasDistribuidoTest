package com.votingapp.model;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String nodeId;
    private List<Node> connectedNodes;

    public Node(String nodeId) {
        this.nodeId = nodeId;
        this.connectedNodes = new ArrayList<>();
    }

    public void connectNode(Node node) {
        if (!connectedNodes.contains(node)) {
            connectedNodes.add(node);
            node.connectNode(this); // conexão bidirecional
            System.out.println("Node " + nodeId + " connected to " + node.getNodeId());
        }
    }

    public void executeCommand(Command command) {
        System.out.println("Executing command: " + command.getCommandType() + " on Node: " + nodeId);
        command.execute();
    }

    public void sendVote(Vote vote) {
        for (Node node : connectedNodes) {
            System.out.println("Sending vote from Node " + nodeId + " to Node " + node.getNodeId());
            node.receiveVote(vote);
        }
    }

    public void receiveVote(Vote vote) {
        System.out.println("Vote received on Node " + nodeId + ": " + vote.getChoice());
        // Processar o voto
    }

    public String getNodeId() {
        return nodeId;
    }
}
