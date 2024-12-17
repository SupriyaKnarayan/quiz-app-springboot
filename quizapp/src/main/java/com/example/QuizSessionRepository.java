package com.example.quizapp;

import org.springframework.data.jpa.repository.JpaRepository;

// This repository handles CRUD operations for the QuizSession entity
public interface QuizSessionRepository extends JpaRepository<QuizSession, Long> {
}
