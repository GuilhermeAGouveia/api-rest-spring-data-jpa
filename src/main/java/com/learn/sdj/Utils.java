package com.learn.sdj;

import com.learn.sdj.Entity.Student;
import com.learn.sdj.Entity.StudentReq;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {
    public static LocalDate convertStringToLocalDate(String date) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, df);
    }

    public static Student convertObject(StudentReq s){
        Student student = new Student(s.getFirstName(), s.getLastName(), s.getEmail(), s.getBirthday());
        return student;
    }
}
