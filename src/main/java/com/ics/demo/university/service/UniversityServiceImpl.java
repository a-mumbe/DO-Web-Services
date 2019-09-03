package com.ics.demo.university.service;

import com.ics.demo.NotFoundException;
import com.ics.demo.university.model.University;
import com.ics.demo.university.repository.UniversityRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UniversityServiceImpl implements UniversityService{
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

        return universityRepository.findById(id).orElseThrow(()-> new NotFoundException("No university with id "+id+" not found."));
    }

    @Override
    public void delete(Long id) {
        universityRepository.deleteById(id);
    }

    @Override
    public University createUniversity(University university) {
        return universityRepository.save(university);
    }

    @Override
    public University updateUniversity(University university) {
        University found = findById(university.getId());
        found.setLocation(university.getLocation());
        found.setName(university.getName());
        found.setYearFounded(university.getYearFounded());

        return universityRepository.save(found);
    }

    @Override
    public University updateUniversity(Long id, University university) {
        University found = findById(id);
        found.setLocation(university.getLocation());
        found.setName(university.getName());
        found.setYearFounded(university.getYearFounded());

        return universityRepository.save(found);
    }
}
