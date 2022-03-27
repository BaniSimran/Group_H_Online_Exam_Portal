package com.examportal.dto;

import com.examportal.entity.Student;

public class StudentDTO {

    private Long studentId;
    private String studentName;
    private AddressDTO address;
    private Long mobNo;
    private String email;

    public StudentDTO() {
    }
    public StudentDTO(Student student) {
        this.studentId = student.getStudentId();
        this.studentName = student.getStudentName();
        this.address = new AddressDTO(student.getAddress());
        this.mobNo = student.getMobNo();
        this.email = student.getEmail();
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public Long getMobNo() {
        return mobNo;
    }

    public void setMobNo(Long mobNo) {
        this.mobNo = mobNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
