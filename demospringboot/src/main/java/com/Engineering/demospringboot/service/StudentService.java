package com.Engineering.demospringboot.service;

import com.Engineering.demospringboot.Entity.Student;

import java.util.List;

public interface StudentService {
   public  Student savestudent(Student student);

  public List<Student> fetchstudent();

   public  Student fetchbyid(Long studentid);

   public  void Deletebyid(Long stdid);


}
