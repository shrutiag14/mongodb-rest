package com.shrutiagarwal.upwork.service.impl;

import com.shrutiagarwal.upwork.Model.Problem;
import com.shrutiagarwal.upwork.Repository.ProblemRepository;
import com.shrutiagarwal.upwork.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ProblemServiceImpl implements ProblemService {

    @Autowired
    private ProblemRepository problemRepository;

    @Override
    public List<Problem> getProblems(int start, int limit, List<String> companies, List<String> difficulties) {
        PageRequest pageRequest = PageRequest.of(start, limit);
        Page<Problem> problemPage = problemRepository.findAll(pageRequest);

        // Filter by company and difficulty if specified
        return problemPage.stream()
                .filter(problem -> (companies == null || problem.getCompanies().stream().anyMatch(companies::contains)))
                .filter(problem -> (difficulties == null || difficulties.contains(problem.getDifficulty())))
                .collect(Collectors.toList());
    }

}
