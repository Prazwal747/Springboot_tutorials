package com.example.SpringJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentService {


    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo() {
        return studentRepo;
    }

    @Autowired
    public void setStudentRepo(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    public int save(Student student){
        return studentRepo.addStudent(student);
    }

    public List<Student> getAll(){
        return studentRepo.listStudent();
    }

}
