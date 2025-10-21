package ru.urfu;

public class Victim extends Human{
    private String status;

    protected Victim(String[] character, String status) {
        super(character);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
