package com.student.student_management.service;

import com.student.student_management.dao.StudentRepository;
import com.student.student_management.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    //Get All Student
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    //Get Student by id
    public Student getStudentById(int id)
    {
        return studentRepository.findById(id).orElse(null);
    }

    //Update Student
    public Student updateStudent(Student student)
    {
        return studentRepository.save(student);
    }

    //Delete Student
    public void deleteStudentById(int id)
    {
        studentRepository.deleteById(id);
    }

}
