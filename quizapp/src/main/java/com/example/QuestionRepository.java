package com.example.quizapp;

import org.springframework.data.jpa.repository.JpaRepository;

// This repository handles CRUD operations for the Question entity
public interface QuestionRepository extends JpaRepository<Question, Long> {
}