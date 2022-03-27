package com.examportal.dao;

import com.examportal.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineExamStudentDao extends JpaRepository<Student,Long> {

    Student findByEmail(String email);

}
