package com.example.quiz_service.model;

import lombok.Data;

@Data
public class QuizDTO {
    private String categoryName;
    private int numOfQuestions;
    private String title;
}
