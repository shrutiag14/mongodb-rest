package com.shrutiagarwal.upwork;

import com.shrutiagarwal.upwork.Model.Problem;
import com.shrutiagarwal.upwork.Repository.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private ProblemRepository problemRepository;

    @Override
    public void run(String... args) throws Exception {
        // Create the Problem object
        Problem problem = new Problem();
        problem.setProblemId("1");
        problem.setTitle("Problem 1");
        problem.setJobFamily("Engineering");
        problem.setSpeciality("Backend");
        problem.setDifficulty("EASY");
        problem.setCompanies(Arrays.asList("CompanyA", "CompanyB"));
        problem.setFlow(Arrays.asList("section1", "section2"));

        // Save the Problem object to MongoDB
        problemRepository.save(problem);

        System.out.println("Problem inserted successfully!");
    }
}
