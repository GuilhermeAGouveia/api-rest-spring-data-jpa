package com.learn.sdj.API.Controller;

import com.learn.sdj.API.Exception.InsertException;
import com.learn.sdj.API.Exception.StudentNotFoundException;
import com.learn.sdj.Entity.Student;
import com.learn.sdj.Entity.StudentReq;
import com.learn.sdj.Repository.StudentRepository;
import com.learn.sdj.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@CrossOrigin(origins = {"http://localhost:3000"})
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String add(@RequestBody StudentReq s) {
        try {
            Student student = Utils.convertObject(s);
            studentRepository.save(student);
            return "Save";
        } catch (Exception e) {
            throw new InsertException(e.getMessage());
        }
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping(path = "/get/{id}")
    public @ResponseBody
    Optional<Student> getStudent(@PathVariable Long id) {
        return studentRepository.findById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody
    void deleteStudent(@PathVariable Long id) {
        try {
            studentRepository.deleteById(id);
        } catch (Exception e) {
            throw new StudentNotFoundException(e.getMessage());
        }
    }

    @GetMapping(path = "/firstname/{id}")
    public @ResponseBody
    String getFirstNameStudent(@PathVariable Long id) {
        return studentRepository.findFirstNameById(id);
    }
}
