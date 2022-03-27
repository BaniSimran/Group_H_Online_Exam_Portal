package com.examportal.dao;

import com.examportal.entity.TestRegistration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRegistrationDao extends JpaRepository<TestRegistration,Long> {
}
