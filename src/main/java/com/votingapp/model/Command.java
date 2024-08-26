package com.votingapp.model;

public class Command {
    private String commandId;
    private String commandType;
    private String[] parameters;

    public Command(String commandType, String[] parameters) {
        this.commandId = generateCommandId();
        this.commandType = commandType;
        this.parameters = parameters;
    }

    private String generateCommandId() {
        return "CMD-" + System.currentTimeMillis();
    }

    public void execute() {
        // Lógica para executar o comando
        System.out.println("Command executed: " + commandType);
    }

    public String getCommandType() {
        return commandType;
    }

    public String getCommandId() {
        return commandId;
    }

    public String[] getParameters() {
        return parameters;
    }
}
