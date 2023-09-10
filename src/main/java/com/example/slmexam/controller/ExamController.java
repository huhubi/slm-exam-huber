package com.example.slmexam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExamController {
    private final List<Integer> factorials = new ArrayList<>();



    @RequestMapping("/factorial")
    public int calculateFactorial(@RequestParam(required = true, name = "number") int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        factorials.add(result);
        return result;
    }

    @RequestMapping("factorial/total")
    public long getTotalFactorial() {
        return factorials.stream().mapToInt(Integer::intValue).sum();
    }
}



