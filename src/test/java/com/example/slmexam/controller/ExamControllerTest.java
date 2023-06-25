package com.example.slmexam.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExamControllerTest {
    @Test
    public void testGetStatus() {
        String expected = "hello world";
        String actual = new ExamController().getStatus();
        assertEquals(expected, actual);
    }
}
