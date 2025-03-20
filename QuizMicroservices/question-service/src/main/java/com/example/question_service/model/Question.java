package com.example.question_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "quiz_questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "questionId")
    private Integer questionId;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    @Column(name = "correctAnswer")
    private String correctAnswer;
    private String category;
}
