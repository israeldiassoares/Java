package br.com.israelsoares.maratonajava.javacore.Hinheritance.test;

import br.com.israelsoares.maratonajava.javacore.Hinheritance.domain.Address;
import br.com.israelsoares.maratonajava.javacore.Hinheritance.domain.Employee;
import br.com.israelsoares.maratonajava.javacore.Hinheritance.domain.Person;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();

        address.setStreet("Rua das Flores");
        address.setCep("08471-179");

        Person person = new Person("Arthur Dent");
        person.setCpf("123.123.123-12");
        person.setAdress(address);

        person.print();
        Employee employee = new Employee("Funcionario 1", 13000);
        employee.setCpf("123.123.123-11");
        employee.setAdress(address);
        employee.setSalary(13000);
        employee.print();
    }
}
