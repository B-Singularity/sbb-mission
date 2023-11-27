package com.ll.sb20231114;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class AnswerRepositoryTest {
    final AnswerRepository answerRepository;

    @Autowired
    AnswerRepositoryTest(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }
    @Test
    void testJpa() {
        Answer a1 = Answer.builder()
                .subject("sbb가 무엇인가요?")
                .content("sbb에 대해서 알고 싶습니다.")
                .createDate(LocalDateTime.now())
                .build();
        this.answerRepository.save(a1);
    }
}
