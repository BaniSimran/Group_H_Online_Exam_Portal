package com.examportal.dao;

import com.examportal.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineExamQuestionDao extends JpaRepository<Question,Long> {
}
