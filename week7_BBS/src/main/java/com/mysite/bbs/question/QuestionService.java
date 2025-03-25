package com.mysite.bbs.question;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class QuestionService {
	private final QuestionRepository qRepository;
	
	public void save(Question q) {
		qRepository.save(q);
		
	}
	public List<Question> getList(){
		return qRepository.findAll();
	}
	
	public Question getQuestion(int id) {
		
		Optional<Question> q = qRepository.findById(id);	
		
		return q.get();
	}
	
	
}
