package com.mysite.bbs.question;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import lombok.RequiredArgsConstructor;


@RequestMapping("/question")  //url요청의 Prefix적용
@RequiredArgsConstructor
@Controller
public class QuestionController {

    private final QuestionService qService; // QuestionService를 주입

    @RequestMapping("/index")  //요청 결과 :  /question/index
    public String root() {
        return "index";
    }

    @GetMapping("/insertForm")  //요청결과 : /question/insertForm
    public String insertForm() {
        return "insertForm";
    }

    @GetMapping("/insert") //요청결과 : /question/insert
    public String insert(@RequestParam("subject") String subject,
                         @RequestParam("content") String content) {
        // 입력된 값을 가지고 데이터베이스에 insert 처리
        Question q = new Question();
        q.setSubject(subject);
        q.setContent(content);
        q.setCreateDate(LocalDateTime.now());
        qService.save(q);

        // 데이터 저장 후 목록 페이지로 리다이렉션
        return "redirect:/question/list";
    }

    @GetMapping("/list") //요청결과 : /question/list
    public String list(Model model) {
        // Question 테이블에 있는 모든 정보를 읽어서 뷰 페이지에 전달
        List<Question> qList = qService.getList();
        model.addAttribute("qList", qList);

        return "question_list";
    }
    
    
    @GetMapping("/detail/{id}") //요청결과 : /question/detail
    public String detail(@PathVariable("id") int id,
    		Model model) {
    	
    	Question q = qService.getQuestion(id);
    	model.addAttribute("q",q);
    	return "question_detail";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
