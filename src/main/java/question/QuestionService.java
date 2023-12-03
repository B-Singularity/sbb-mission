package question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        List<Question> originalList = this.questionRepository.findAll();
        return Collections.unmodifiableList(List.copyOf(originalList));
    }

    public Optional<Question> getQuestionById(int id) {
        return this.questionRepository.findById(id);
    }


}
