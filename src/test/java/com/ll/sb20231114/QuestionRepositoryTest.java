package com.ll.sb20231114;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
@RequiredArgsConstructor
public class QuestionRepositoryTest {
    private final QuestionRepository questionRepository;

    @Test
    public void isQuestionRepositoryNull() {
        assertThat(questionRepository).isNotNull();
    }
}
