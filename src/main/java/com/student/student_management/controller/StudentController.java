package com.student.student_management.controller;


import com.student.student_management.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.student.student_management.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/studentService")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/health")
    public String healthCheck() {
        try {
            studentService.getAllStudent(); // basic DB call
            return "DB Connection OK";
        } catch (Exception e) {
            return "DB Connection Failed: " + e.getMessage();
        }
    }

    //Save Student
    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student)
    {
        System.out.println("Saving student: " + student);
        return studentService.saveStudent(student);
    }

    //Get All Students
    @GetMapping("/getAllStudents")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    //Get Student By id
    @GetMapping("/getStudent/{id}")
     public String getStudentById(@PathVariable("id") Integer id)
    {
        //System.out.println(studentService.getStudentById(id).toString());
        return studentService.getStudentById(id).toString();
    }



    //Update Student
    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    //Delete Student By id
    @DeleteMapping("/deleteStudentById/{id}")
    public void deleteStudentById(@PathVariable("id") Integer studentId)
    {
        studentService.deleteStudentById(studentId);
    }



}
