package ru.urfu;

public abstract class Human {
    private final String name;
    private final String surname;
    private final String age;
    private final String profession;
    private final String impression;
    private final String reason;

    protected Human(String[] character) {
        this.name = character[0];
        this.surname = character[1];
        this.age = character[2];
        this.profession = character[3];
        this.impression = character[4];
        this.reason = character[5];
    }

    public void getInfo(){
        System.out.println(name+" "+surname+" "+age+"\n"+profession+"\n"+impression+"\n"+reason);
    }
}
