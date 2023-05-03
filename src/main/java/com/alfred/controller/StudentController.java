package com.alfred.controller;

import com.alfred.pojo.Result;
import com.alfred.pojo.Student;
import com.alfred.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("add")
    private Result add(@RequestBody Student student){
        log.info("add a student:{}",student);
        Student res = studentService.saveStudent(student);
        return Result.success(res);
    }

    @GetMapping("getAll")
    private Result getAll(){
        log.info("query all students");
        List<Student> res = studentService.getAllStudents();
        return Result.success(res);
    }
    @DeleteMapping("{id}")
    private Result deleteById(@PathVariable Integer id){
        log.info("remove student by ID:{}",id);
        studentService.deleteById(id);
        return Result.success();
    }
}
