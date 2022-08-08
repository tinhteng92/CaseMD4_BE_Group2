package com.codegym.controller;

import com.codegym.model.Receipt;
import com.codegym.model.UserQuestion;
import com.codegym.service.IUserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@CrossOrigin("*")
@RequestMapping("/userQuestions")
public class UserQuestionController {
    @Autowired
    IUserQuestionService userQuestionService;

    @PostMapping
    public UserQuestion save(@RequestBody UserQuestion userQuestion) {
        userQuestion.setTimeMessage(LocalDateTime.now());
        userQuestionService.save(userQuestion);
        return userQuestion;
    }

    @GetMapping
    public Page<UserQuestion> getAll(@RequestParam(defaultValue = "0") int page) {
        return userQuestionService.getAll(PageRequest.of(page, 5));
    }
}
