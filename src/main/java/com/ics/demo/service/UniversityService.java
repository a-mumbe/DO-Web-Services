package com.ics.demo.service;

import com.ics.demo.model.University;

import java.util.List;

public interface UniversityService {

    List<University> findAll();
    University findById(Long id);
}
