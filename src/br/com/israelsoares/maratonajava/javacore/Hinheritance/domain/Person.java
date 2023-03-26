package br.com.israelsoares.maratonajava.javacore.Hinheritance.domain;

public class Person {
    protected String name;
    protected String cpf;
    protected Address adress;

    public Person(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name + "\n" + this.cpf + " \n" + this.adress.getStreet() + "\n" + this.adress.getCep());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }
}
