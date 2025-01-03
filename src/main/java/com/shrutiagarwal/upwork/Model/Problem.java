package com.shrutiagarwal.upwork.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "problems")
@Data
public class Problem {
    @Id
    private String problemId;
    private String title;
    private String jobFamily;
    private String speciality;
    private String difficulty;
    private List<String> companies;
    private boolean hasSolved;
    private List<String> flow;
}
