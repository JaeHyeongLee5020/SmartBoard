package com.mysite.bbs.answer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    // 기본적인 CRUD 메서드를 상속받아 사용
}
