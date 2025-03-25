package com.mysite.bbs.answer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.bbs.question.Question;
import com.mysite.bbs.question.QuestionService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/answer")
@RequiredArgsConstructor
@Controller
public class AnswerController {
	
	private final AnswerService answerService;
	private final QuestionService questionService;
	
	@PostMapping("/create/{id}")
	public String creat(@PathVariable("id") int id,
			@RequestParam("content") String content ) {
		//답변 등록을 위한 필요요소 : 질문객체, 답변 내용
		Question question = questionService.getQuestion(id);
		
		//답변 등록 처리 
		answerService.create(question, content);
		
		return String.format("redirect:/question/detail/%s", id);
	}
	

}
