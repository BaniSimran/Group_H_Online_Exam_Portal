package com.examportal.dao;

import com.examportal.entity.Choices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineExamChoicesDao extends JpaRepository<Choices,Long> {
}
