package br.com.israelsoares.maratonajava.javacore.Gassociation.exercise.domain;

public class Local {
    private String address;

    private Seminar seminar;

    public Local(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }
}
