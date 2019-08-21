package com.ics.demo;

import com.ics.demo.oopConcepts.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Bird bird = new Bird(TypeOfEyes.COMPOUND, "Ostrich", TypeOfBeak.BLUNT);
        Mammal mammal = new Mammal(TypeOfEyes.SIMPLE, "Man", 2, 9);
        Fish fish = new Fish(TypeOfEyes.COMPOUND, "Shark fish", 4);

        System.out.println("Bird: "+bird.toString()+ "\n Fish: "+ fish.toString()+ "\n Mammal: "+mammal.toString());
        bird.move();
        mammal.move();
        fish.move();

    }

}
