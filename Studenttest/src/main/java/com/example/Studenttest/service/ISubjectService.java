package com.example.Studenttest.service;

import com.example.Studenttest.entity.Subject;

import java.util.List;
import java.util.Optional;

public interface ISubjectService {
    public List<Subject> getAllSubject();
    public Optional<Subject> getSubjectById(Integer id);
    public void save(Subject subject);
    public void delete(Integer id);
}
