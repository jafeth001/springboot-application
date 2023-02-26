package com.Engineering.demospringboot.Controller;

import com.Engineering.demospringboot.Entity.Student;
import com.Engineering.demospringboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StdController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/std")
    public Student savestudent(@RequestBody Student student){
       return studentService.savestudent(student);
    }
    @GetMapping("/std")
    public List<Student> fetchstudent(){
        return studentService.fetchstudent();
    }
    @GetMapping("/std/{id}")
    public Student fetchbyid(@PathVariable ("id") Long studentid  ){
        return studentService.fetchbyid(studentid);
    }
    @DeleteMapping("/std/{id}")
    public String Deletebyid(@PathVariable ("id") Long stdid){
        studentService.Deletebyid(stdid);
        return  " Student Deleted Successfully";
    }

}
