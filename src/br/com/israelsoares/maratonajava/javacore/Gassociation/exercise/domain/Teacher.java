package br.com.israelsoares.maratonajava.javacore.Gassociation.exercise.domain;

public class Teacher {
    private String name;
    private String expertise;

    private Seminar[] seminars;

    public Teacher(String name, String expertise) {
        this.name = name;
        this.expertise = expertise;
    }

    public Teacher(String name, String expertise, Seminar[] seminars) {
        this.name = name;
        this.expertise = expertise;
        this.seminars = seminars;
    }

    public void print() {
        System.out.println("------------");
        System.out.println("Teacher " + this.name);
        if (seminars == null) return;
        System.out.println("### Registred Seminars ###");
        for (Seminar seminar : seminars) {
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getLocal().getAddress());
            if (seminar.getStudents() == null || seminar.getStudents().length == 0) continue;
            System.out.println("**** Students ****");
            for (Student student : seminar.getStudents()) {
                System.out.println(student.getName() + "\n" + student.getAge());
            }

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }
}
