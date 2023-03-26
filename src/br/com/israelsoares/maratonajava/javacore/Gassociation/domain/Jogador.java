package br.com.israelsoares.maratonajava.javacore.Gassociation.domain;

public class Jogador {
    private String name;
    private Time time;

    public Jogador(String name) {
        this.name = name;
    }

    public Jogador(String name, Time time) {
        this.name = name;
        this.time = time;
    }

    public void print() {
        System.out.println(this.name);

        if(time !=  null){
            System.out.println(time.getName());
        }
    }
    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
