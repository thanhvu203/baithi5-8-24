package com.example.Studenttest.service;

import com.example.Studenttest.entity.StudentScore;

import java.util.List;
import java.util.Optional;

public interface ScoreService {
    public List<StudentScore> getAllStudentScore();
    public Optional<StudentScore> getStudentScoreById(Integer id);
    public void save(StudentScore studentScore);
    public void delete(Integer id);
}