package com.ll.sb20231114;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class QuestionRepositoryTest {
    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionRepositoryTest(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Test
    public void isQuestionRepositoryNull() {
        assertThat(questionRepository).isNotNull();
    }
}
