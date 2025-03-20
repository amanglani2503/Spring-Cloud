package com.example.question_service.dao;

import com.example.question_service.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDAO extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String category);

    @Query(value = "SELECT q.question_id FROM quiz_questions q WHERE q.category=:category ORDER BY RAND() LIMIT :#{#numQ}", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(@Param("category") String category, @Param("numQ") int numQ);

}
