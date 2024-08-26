package com.votingapp.model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
    private String userId;
    private String username;
    private String passwordHash;

    public User(String username, String password) throws NoSuchAlgorithmException {
        this.username = username;
        this.userId = generateUserId();
        this.passwordHash = hashPassword(password);
    }

    private String generateUserId() {
        return "USR-" + System.currentTimeMillis();
    }

    private String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(password.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public boolean authenticate(String password) throws NoSuchAlgorithmException {
        return this.passwordHash.equals(hashPassword(password));
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }
}
