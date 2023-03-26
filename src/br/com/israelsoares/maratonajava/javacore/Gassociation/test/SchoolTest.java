package br.com.israelsoares.maratonajava.javacore.Gassociation.test;

import br.com.israelsoares.maratonajava.javacore.Gassociation.domain.School;
import br.com.israelsoares.maratonajava.javacore.Gassociation.domain.Teacher;

public class SchoolTest {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Girafales");
        Teacher teacher1 = new Teacher("Gato de Botas");
        Teacher[] teachers = {teacher, teacher1};
        School school = new School("Acapulco", teachers);

        school.print();
    }
}
