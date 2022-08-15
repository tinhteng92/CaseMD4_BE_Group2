package com.codegym.controller;


import com.codegym.model.UserQuestion;
import com.codegym.service.IUserQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequestMapping("/admin/userQuestions")
public class UserQuestionAdmin {
    @Autowired
    IUserQuestionService userQuestionService;


    @GetMapping
    public Page<UserQuestion> getAll(@RequestParam(defaultValue = "0") int page) {
        return userQuestionService.getAll(PageRequest.of(page, 5));
    }
}
