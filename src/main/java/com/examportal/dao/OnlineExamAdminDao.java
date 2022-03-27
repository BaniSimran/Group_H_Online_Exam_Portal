package com.examportal.dao;

import com.examportal.entity.Admin;
import com.examportal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineExamAdminDao extends JpaRepository<Admin,Long> {

    Admin findByEmail(String email);

    Admin findByAdminName(String adminName);
}
