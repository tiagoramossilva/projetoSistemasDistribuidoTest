package com.votingapp.model;

public class Vote {
    private String voteId;
    private String userId;
    private String choice;
    private long timestamp;

    public Vote(String voteId, String userId, String choice, long timestamp) {
        this.voteId = voteId;
        this.userId = userId;
        this.choice = choice;
        this.timestamp = timestamp;
    }

    public String getChoice() {
        return choice;
    }

    public String getVoteId() {
        return voteId;
    }

    public String getUserId() {
        return userId;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
