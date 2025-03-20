package com.example.question_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QuestionWrapper {
    private Integer questionId;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;


}
