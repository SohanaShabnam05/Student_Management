package com.student.student_management.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String DOB;
    private String fatherName;
    private String motherName;

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", DOB=" + DOB +
                ", fatherName=" + fatherName + ", motherName=" + motherName + "]";
    }



}
