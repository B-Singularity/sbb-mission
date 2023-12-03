package com.ll.sb20231114;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import question.Question;
import question.QuestionRepository;
import question.QuestionService;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class QuestionServiceTest {
    @InjectMocks
    private QuestionService target;
    @Mock
    private QuestionRepository questionRepository;

    //전체 질문 리스트 조회 구현
    @Test
    public void testGetList() {
        List<Question> fakeoriginalList = Arrays.asList(
                new Question(1, "Question 1", "Content 1", LocalDateTime.now(), Collections.emptyList()),
                new Question(2, "Question 2", "Content 2", LocalDateTime.now(), Collections.emptyList())
        );

        when(questionRepository.findAll()).thenReturn(fakeoriginalList);

        List<Question> result = target.getList();
        assertEquals(2, result.size());
    }

    //아이디로 질문검색 구현
    @Test
    public void testGetQuestionById() {
        int idToFind = 1;

        // Mock 객체의 findById 메서드를 설정
        Question questionToReturn = new Question(1, "Question 1", "Content 1", LocalDateTime.now(), Collections.emptyList());
        when(questionRepository.findById(idToFind)).thenReturn(Optional.of(questionToReturn));

        // 테스트 대상 메서드 호출
        Optional<Question> question = target.getQuestionById(idToFind);

        // 결과 확인
        assertEquals(questionToReturn, question.orElseThrow(() -> new DataNotFoundException("question not found")));
    }
}
