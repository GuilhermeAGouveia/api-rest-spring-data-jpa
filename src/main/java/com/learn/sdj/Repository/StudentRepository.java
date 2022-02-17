package com.learn.sdj.Repository;

import com.learn.sdj.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select student.firstName from Student student where student.id = ?1 ")
    String findFirstNameById(Long id);

    @Query("select s from Student s where s.id = ?1")
    Student getById(Long id);
}
