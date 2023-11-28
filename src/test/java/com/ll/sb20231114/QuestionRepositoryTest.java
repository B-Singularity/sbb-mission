package com.ll.sb20231114;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class QuestionRepositoryTest {
    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionRepositoryTest(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Test
    @DisplayName("기본 기능 테스트")
    void test1() {
        Question q1 = Question.builder()
                .subject("sbb가 무엇인가요?")
                .content("sbb에 대해서 알고 싶습니다.")
                .createDate(LocalDateTime.now())
                .build();
        this.questionRepository.save(q1);

        Question q2 = Question.builder()
                .subject("스프링부트 모델 질문입니다.")
                .content("id는 자동으로 생성되나요?")
                .createDate(LocalDateTime.now())
                .build();
        this.questionRepository.save(q2);
    }

    @Test
    @DisplayName("데이터 조회하기")
    void test2() {
        List<Question> originalList = this.questionRepository.findAll();
        List<Question> copiedList = new ArrayList<>();

        for (Question originalQuestion : originalList) {
            Question copiedQuestion = Question.builder()
                    .subject(new String(originalQuestion.getSubject()))
                    .content(new String(originalQuestion.getContent()))
                    .createDate(originalQuestion.getCreateDate())
                    .build();

            copiedList.add(copiedQuestion);
        }

        assertEquals(2, copiedList.size());

        Question q = copiedList.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());
    }
}
