package com.shrutiagarwal.upwork.Repository;

import com.shrutiagarwal.upwork.Model.Problem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemRepository extends MongoRepository<Problem, String> {
}