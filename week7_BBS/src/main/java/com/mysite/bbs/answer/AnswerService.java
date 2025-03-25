package com.mysite.bbs.answer;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;
import com.mysite.bbs.question.Question;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;
    
    public void create(Question question, String content) { // creat -> create로 수정
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now()); // creatDate -> createDate로 수정
        answer.setQuestion(question);
        answerRepository.save(answer); // Answer 엔티티를 데이터베이스에 저장
    }
}
