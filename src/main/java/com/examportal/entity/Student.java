package com.examportal.entity;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String studentName;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    private Long mobNo;

    @Column(unique = true)
    private String email;

    private String pass;

    public Student() {
    }

    public Student(Long studentId, String studentName, Address address, Long mobNo, String email, String pass) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.mobNo = mobNo;
        this.email = email;
        this.pass = pass;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
