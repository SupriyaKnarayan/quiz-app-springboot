package com.example.quizapp;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class QuizSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date startTime;
    private int correctAnswers;
    private int incorrectAnswers;

    // Getters and setters
}
