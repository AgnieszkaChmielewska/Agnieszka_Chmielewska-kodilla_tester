package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Teacher Krystian = new Teacher("Krystian");
        Teacher Adam = new Teacher("Adam");
        students.add(new Student("Adam Kwalski",null));
        students.add(new Student("Jan Nowak",Krystian));
        students.add(new Student("Kasia Stępień",Adam));
        students.add(new Student("Ala Wożniak",null));

        for (Student a:students) {
            Optional<Student> optionalStudent = Optional.ofNullable(a);
            Optional<Teacher> optionalTeacher = Optional.ofNullable(a.getTeacher());
            Teacher teacherName = optionalTeacher.orElse(new Teacher(null));
           optionalStudent.ifPresent(u->System.out.println("uczeń: "+a.getName()+", nauczyciel: "+ teacherName));

        }
    }
}
