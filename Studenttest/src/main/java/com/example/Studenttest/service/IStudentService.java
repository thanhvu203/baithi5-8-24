package com.example.Studenttest.service;

import com.example.Studenttest.entity.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    public List<Student> getAllStudent();
    public Optional<Student> getStudentById(Integer id);
    public void save(Student student);
    public void delete(Integer id);
}
