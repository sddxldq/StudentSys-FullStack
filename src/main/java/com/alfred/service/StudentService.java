package com.alfred.service;

import com.alfred.pojo.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

    void deleteById(Integer id);
}
