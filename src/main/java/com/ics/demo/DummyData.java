package com.ics.demo;

import com.ics.demo.student.model.Student;
import com.ics.demo.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DummyData implements CommandLineRunner {

    //private final UniversityRepository universityRepository;
    private final StudentRepository studentRepository;

    public DummyData(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //public DummyData(UniversityRepository universityRepository) {
       // this.universityRepository = universityRepository;
    //}

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student("Beatrice", "Kinya");
        studentRepository.save(student);
//        University university = new University("Kirinyaga", "Kirinyaga");
//        University strath = new University("Strathmore", "Ole Sangale");
//        universityRepository.save(strath);
//        University jkuat = new University("JKUAT", "Juja");
//        universityRepository.save(jkuat);
//        University ku = new University("KU", "Thika");
//        universityRepository.save(ku);

    }
}
