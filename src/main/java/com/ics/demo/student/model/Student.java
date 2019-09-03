package com.ics.demo.student.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull(groups = Update.class)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstname")
    @NotNull(groups = Create.class)
    private String fname;

    @Column(name = "middlename")
    private String mname;

    @Column(name = "lastname")
    @NotNull(groups = Create.class)
    private String lname;

    @Column(name = "dob")
    private String dob;

    public Student(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public Student() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public interface Update{}

    public interface Create{}
}
