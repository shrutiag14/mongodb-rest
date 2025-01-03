package com.shrutiagarwal.upwork.service;

import com.shrutiagarwal.upwork.Model.Problem;
import com.shrutiagarwal.upwork.Repository.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

public interface ProblemService {

    List<Problem> getProblems(int start, int limit, List<String> companies, List<String> difficulties);

}