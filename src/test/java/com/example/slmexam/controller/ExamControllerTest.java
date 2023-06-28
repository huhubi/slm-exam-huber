package com.example.slmexam.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExamControllerTest {

    @Test
    public void testCalculateFactorial() {
        ExamController examController = new ExamController();
        assertEquals(120, examController.calculateFactorial(5));
    }

    @Test
    public void testGetTotalFactorial() {
        ExamController examController = new ExamController();
        examController.calculateFactorial(5);
        examController.calculateFactorial(6);
        assertEquals(840, examController.getTotalFactorial());
    }

    @Test
    public void testAngabe() {
        ExamController examController = new ExamController();
        examController.calculateFactorial(4);
        examController.calculateFactorial(5);
        assertEquals(144, examController.getTotalFactorial());
    }



}

