package br.com.israelsoares.maratonajava.javacore.Gassociation.exercise.test;

import br.com.israelsoares.maratonajava.javacore.Gassociation.exercise.domain.Local;
import br.com.israelsoares.maratonajava.javacore.Gassociation.exercise.domain.Seminar;
import br.com.israelsoares.maratonajava.javacore.Gassociation.exercise.domain.Student;
import br.com.israelsoares.maratonajava.javacore.Gassociation.exercise.domain.Teacher;

public class SeminarTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua do Lirio");
        Student student = new Student("Joãozinho", 23);
        Student student1 = new Student("Carlim", 32);
        Teacher teacher = new Teacher("Prof Pardal", "Bigiganga");
        Student[] students = {student, student1};

        Seminar seminar = new Seminar("Java Pá vida", students, local);
        Seminar[] seminars = {seminar};


        teacher.setSeminars(seminars);
        teacher.print();
    }
}
