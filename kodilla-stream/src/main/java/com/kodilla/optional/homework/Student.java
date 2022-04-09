package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    String name;
    Optional<Teacher> teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = Optional.ofNullable(teacher);
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher.orElse(new Teacher("udefined"));
    }
}
