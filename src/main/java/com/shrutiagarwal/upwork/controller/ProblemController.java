package com.shrutiagarwal.upwork.controller;

import com.shrutiagarwal.upwork.Model.Problem;
import com.shrutiagarwal.upwork.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/problems")
public class ProblemController {

    @Autowired
    private ProblemService problemService;

    @GetMapping
    public List<Problem> getProblems(
            @RequestParam(value = "start", defaultValue = "0") int start,
            @RequestParam(value = "limit", defaultValue = "10") int limit,
            @RequestParam(value = "company", required = false) List<String> company,
            @RequestParam(value = "difficulty", required = false) List<String> difficulty
    ) {
        return problemService.getProblems(start, limit, company, difficulty);
    }
}