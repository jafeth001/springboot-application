package com.Engineering.demospringboot.service;

import com.Engineering.demospringboot.Entity.Student;
import com.Engineering.demospringboot.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student savestudent(Student student)          {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> fetchstudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student fetchbyid(Long studentid) {
        return studentRepository.findById(studentid).get();
    }

    @Override
    public void Deletebyid(Long stdid) {
        studentRepository.deleteById(stdid);
    }



}
