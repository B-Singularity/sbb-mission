package question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        List<Question> originalList = this.questionRepository.findAll();
        return Collections.unmodifiableList(List.copyOf(originalList));
    }
}
