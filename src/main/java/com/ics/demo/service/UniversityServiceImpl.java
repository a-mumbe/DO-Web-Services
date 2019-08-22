package com.ics.demo.service;

import com.ics.demo.model.University;
import com.ics.demo.repository.UniversityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversityServiceImpl implements UniversityService {
    //field injection
//    @Autowired
//    UniversityRepository universityRepository;
    private final UniversityRepository universityRepository;

    public UniversityServiceImpl(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public List<University> findAll() {
        return universityRepository.findAll();
    }

    @Override
    public University findById(Long id) {
        return universityRepository.findById(id).get();
    }
}
