package com.ics.demo;

import com.ics.demo.model.University;
import com.ics.demo.repository.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {

    private final UniversityRepository universityRepository;

    public DummyData(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        University strath = new University("Strathmore", "Ole Sangale");
        universityRepository.save(strath);
        University jkuat = new University("JKUAT", "Juja");
        universityRepository.save(jkuat);
        University ku = new University("KU", "Thika");
        universityRepository.save(ku);

    }
}
